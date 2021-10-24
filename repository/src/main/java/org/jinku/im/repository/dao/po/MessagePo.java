package org.jinku.im.repository.dao.po;

import lombok.Data;

@Data
public class MessagePo {
    private Long id;
    private Long msgId;
    private Long senderId;
    private Integer groupType;
    private Long groupId;
    private String msgData;
    private Integer valid;
    private Integer ctime;
    private Integer utime;
}
