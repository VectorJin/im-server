package org.jinku.im.application.param;

import lombok.Data;

@Data
public class SendMsgParam {
    /**
     * 用户ID
     */
    private long userId;
    /**
     * 群组类型
     */
    private int groupType;
    /**
     * 群组ID（单聊为对方用户ID）
     */
    private long groupId;
    /**
     * 消息结构体
     */
    private MsgData msgData;

    @Data
    public static class MsgData {
        /**
         * 普通文本
         */
        private String text;
    }
}
