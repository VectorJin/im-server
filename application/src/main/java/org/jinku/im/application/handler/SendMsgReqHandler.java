package org.jinku.im.application.handler;

import org.jinku.im.application.convert.MessageConverter;
import org.jinku.im.application.param.SendMsgParam;
import org.jinku.im.domain.entity.Message;
import org.jinku.im.domain.repository.MessageRepository;
import org.jinku.im.domain.service.MessageSyncService;
import org.springframework.stereotype.Component;

/**
 * 发送消息
 */
@Component
public class SendMsgReqHandler extends AbstractReqHandler<SendMsgParam> {

    private final MessageRepository messageRepository;
    private final MessageConverter messageConverter;
    private final MessageSyncService messageSyncService;

    public SendMsgReqHandler(MessageRepository messageRepository, MessageConverter messageConverter,
                             MessageSyncService messageSyncService) {
        this.messageRepository = messageRepository;
        this.messageConverter = messageConverter;
        this.messageSyncService = messageSyncService;
    }

    @Override
    protected void handReqObj(SendMsgParam sendMsgParam) {
        // 保存消息
        Message message = messageConverter.convert(sendMsgParam);
        messageRepository.saveMessage(message);
        // 推送同步sync
        messageSyncService.syncMessage(message);
    }

    @Override
    public String supportUrl() {
        return "im/sendMsg";
    }
}
