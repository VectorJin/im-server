package org.jinku.im.domain.vo;

import lombok.Data;
import org.jinku.im.domain.type.SyncBizType;
import org.jinku.im.domain.type.SyncCreatorType;

@Data
public class SyncVo<T> {
    private SyncCreatorType creatorType;
    private long creatorId;
    private SyncBizType bizType;
    private String bizUuid;
    private T bizData;
}
