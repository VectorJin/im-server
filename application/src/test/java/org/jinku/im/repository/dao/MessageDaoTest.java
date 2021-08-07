package org.jinku.im.repository.dao;

import org.jinku.im.BaseTest;
import org.jinku.im.repository.dao.po.MessagePo;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class MessageDaoTest extends BaseTest {

    @Resource
    private MessageDao messageDao;

    @Test
    public void selectById() {
        final long msgId = 123L;
        MessagePo messagePo = messageDao.selectById(msgId);
        Assert.assertNotNull(messagePo);
    }
}
