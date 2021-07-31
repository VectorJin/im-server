package org.jinku.im.application.convert;

import org.jinku.im.application.param.SendMsgParam;
import org.jinku.im.domain.entity.Message;
import org.jinku.im.domain.repository.IDGenRepository;
import org.springframework.stereotype.Component;

@Component
public class MessageConverter {

    private final IDGenRepository idGenRepository;

    public MessageConverter(IDGenRepository idGenRepository) {
        this.idGenRepository = idGenRepository;
    }

    public Message convert(SendMsgParam sendMsgParam) {
        Message message = new Message();
        message.setId(idGenRepository.genID());
        message.setSenderId(sendMsgParam.getUserId());
        message.setGroupId(sendMsgParam.getGroupId());
        message.setGroupType(sendMsgParam.getGroupType());
        message.setText(sendMsgParam.getMsgData().getText());
        return message;
    }
}
