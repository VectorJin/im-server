package org.jinku.im.repository.converter;

import com.alibaba.fastjson.JSON;
import org.jinku.im.domain.entity.Message;
import org.jinku.im.repository.dao.po.MessagePo;
import org.springframework.stereotype.Component;

@Component
public class MessagePoConverter {

    public MessagePo convert(Message message) {
        MessagePo messagePo = new MessagePo();
        messagePo.setMsgId(message.getId());
        messagePo.setSenderId(message.getSenderId());
        messagePo.setGroupType(message.getGroupType().getValue());
        messagePo.setGroupId(message.getGroupId());
        messagePo.setMsgData(JSON.toJSONString(message.getMsgData()));
        messagePo.setCtime((int) (System.currentTimeMillis() / 1000));
        return messagePo;
    }
}
