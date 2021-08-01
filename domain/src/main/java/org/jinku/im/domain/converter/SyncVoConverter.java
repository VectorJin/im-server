package org.jinku.im.domain.converter;

import org.jinku.im.domain.entity.Message;
import org.jinku.im.domain.type.SyncBizType;
import org.jinku.im.domain.type.SyncCreatorType;
import org.jinku.im.domain.vo.SyncVo;
import org.springframework.stereotype.Component;

@Component
public class SyncVoConverter {

    public SyncVo<Message> convert4TargetUser(Message message) {
        SyncVo<Message> syncVo = new SyncVo<>();
        syncVo.setCreatorType(SyncCreatorType.USER);
        syncVo.setCreatorId(message.getSenderId());
        syncVo.setBizType(SyncBizType.IM);
        syncVo.setBizUuid(String.valueOf(message.getGroupId()));
        syncVo.setBizData(message);
        return syncVo;
    }

    public SyncVo<Message> convert4SenderUser(Message message) {
        SyncVo<Message> syncVo = new SyncVo<>();
        syncVo.setCreatorType(SyncCreatorType.USER);
        syncVo.setCreatorId(message.getSenderId());
        syncVo.setBizType(SyncBizType.IM);
        syncVo.setBizUuid(String.valueOf(message.getSenderId()));
        syncVo.setBizData(message);
        return syncVo;
    }
}
