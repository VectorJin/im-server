package org.jinku.im.domain.entity;

import lombok.Data;

/**
 * 消息
 */
@Data
public class Message {

    private long id;
    private long senderId;
    private int groupType;
    private long groupId;
    private String text;

}
