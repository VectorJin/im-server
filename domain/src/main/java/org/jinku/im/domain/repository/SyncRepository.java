package org.jinku.im.domain.repository;

import org.jinku.im.domain.vo.SyncVo;

public interface SyncRepository {

    void pushSync(SyncVo<?>[] syncVos);
}
