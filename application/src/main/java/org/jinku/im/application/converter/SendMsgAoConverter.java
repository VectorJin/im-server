package org.jinku.im.application.converter;

import org.jinku.im.application.ao.SendMsgAo;
import org.jinku.im.domain.entity.Message;
import org.springframework.stereotype.Component;

@Component
public class SendMsgAoConverter {

    public SendMsgAo convert(Message message) {
        SendMsgAo sendMsgAo = new SendMsgAo();
        sendMsgAo.setMsgId(message.getId());
        sendMsgAo.setSenderId(message.getSenderId());
        sendMsgAo.setGroupType(message.getGroupType().getValue());
        sendMsgAo.setGroupId(message.getGroupId());
        SendMsgAo.MsgData msgData = new SendMsgAo.MsgData();
        msgData.setText(message.getMsgData().getText());
        sendMsgAo.setMsgData(msgData);
        return sendMsgAo;
    }
}
