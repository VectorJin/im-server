package org.jinku.im.domain.service;

import org.jinku.im.domain.entity.Message;

public interface MessageSyncService {

    void syncMessage(Message message);
}
