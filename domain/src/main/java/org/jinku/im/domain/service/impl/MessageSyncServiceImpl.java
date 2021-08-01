package org.jinku.im.domain.service.impl;

import org.jinku.im.domain.converter.SyncVoConverter;
import org.jinku.im.domain.entity.Message;
import org.jinku.im.domain.repository.SyncRepository;
import org.jinku.im.domain.service.MessageSyncService;
import org.jinku.im.domain.type.GroupType;
import org.jinku.im.domain.vo.SyncVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageSyncServiceImpl implements MessageSyncService {

    private final SyncRepository syncRepository;
    private final SyncVoConverter syncVoConverter;

    public MessageSyncServiceImpl(SyncRepository syncRepository, SyncVoConverter syncVoConverter) {
        this.syncRepository = syncRepository;
        this.syncVoConverter = syncVoConverter;
    }

    @Override
    public void syncMessage(Message message) {
        if (message.getGroupType() == GroupType.SINGLE) {
            pushSingleMsg(message);
        } else if (message.getGroupType() == GroupType.GROUP) {
            pushGroupMsg(message);
        }
    }

    private void pushSingleMsg(Message message) {
        List<SyncVo<Message>> syncVos = new ArrayList<>();
        syncVos.add(syncVoConverter.convert4TargetUser(message));
        syncVos.add(syncVoConverter.convert4SenderUser(message));
        syncRepository.pushSync(syncVos.toArray(new SyncVo<?>[0]));
    }

    public void pushGroupMsg(Message message) {
        //TODO 通过MQ异步写群组消息
    }
}
