package org.jinku.im.domain.entity;

import lombok.Data;
import org.jinku.im.domain.type.GroupType;

/**
 * 消息
 */
@Data
public class Message {

    private long id;
    private long senderId;
    private GroupType groupType;
    private long groupId;
    private MsgData msgData;

    @Data
    public static class MsgData {
        private String text;
    }

}
