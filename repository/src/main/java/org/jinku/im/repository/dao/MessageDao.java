package org.jinku.im.repository.dao;

import org.apache.ibatis.annotations.Param;
import org.jinku.im.repository.dao.po.MessagePo;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao {

    void insert(MessagePo messagePo);

    MessagePo selectById(@Param("msgId") long msgId);
}
