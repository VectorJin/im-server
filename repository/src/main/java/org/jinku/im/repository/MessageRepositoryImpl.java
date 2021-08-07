package org.jinku.im.repository;

import org.jinku.im.domain.entity.Message;
import org.jinku.im.domain.repository.MessageRepository;
import org.jinku.im.repository.converter.MessagePoConverter;
import org.jinku.im.repository.dao.MessageDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageRepositoryImpl implements MessageRepository {

    @Resource
    private MessageDao messageDao;
    @Resource
    private MessagePoConverter messagePoConverter;

    @Override
    public void saveMessage(Message message) {
        messageDao.insert(messagePoConverter.convert(message));
    }
}
