package org.jinku.im.application.handler;

import org.jinku.im.application.ao.ResultAo;
import org.jinku.im.application.converter.MessageConverter;
import org.jinku.im.application.converter.SendMsgAoConverter;
import org.jinku.im.application.param.SendMsgParam;
import org.jinku.im.domain.entity.Message;
import org.jinku.im.domain.repository.MessageRepository;
import org.jinku.im.domain.service.MessageSyncService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 发送消息
 */
@Component
public class SendMsgReqHandler extends AbstractReqHandler<SendMsgParam> {

    @Resource
    private MessageRepository messageRepository;
    @Resource
    private MessageConverter messageConverter;
    @Resource
    private MessageSyncService messageSyncService;
    @Resource
    private SendMsgAoConverter sendMsgAoConverter;

    @Override
    protected ResultAo handReqObj(SendMsgParam sendMsgParam) {
        // 保存消息
        Message message = messageConverter.convert(sendMsgParam);
        messageRepository.saveMessage(message);
        //TODO 保存会话
        // 推送同步sync
        messageSyncService.syncMessage(message);
        return ResultAo.success(sendMsgAoConverter.convert(message));
    }

    @Override
    public String supportUrl() {
        return "im/sendMsg";
    }
}
