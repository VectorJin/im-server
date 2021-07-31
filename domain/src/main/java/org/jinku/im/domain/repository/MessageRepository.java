package org.jinku.im.domain.repository;

import org.jinku.im.domain.entity.Message;

public interface MessageRepository {

    void saveMessage(Message message);
}
