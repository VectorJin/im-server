package org.jinku.im.repository.param;

import lombok.Data;

@Data
public class PushSyncParam {
    private int creatorType;
    private long creatorId;
    private int bizType;
    private String bizUuid;
    private String dataJson;
}
