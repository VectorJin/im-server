package org.jinku.im.application.ao;

import lombok.Data;
import org.jinku.im.domain.type.GroupType;

@Data
public class SendMsgAo {
    private long msgId;
    private long senderId;
    private int groupType;
    private long groupId;
    private MsgData msgData;

    @Data
    public static class MsgData {
        private String text;
    }
}
