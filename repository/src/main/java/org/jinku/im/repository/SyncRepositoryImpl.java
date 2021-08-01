package org.jinku.im.repository;

import org.jinku.im.domain.repository.SyncRepository;
import org.jinku.im.domain.vo.SyncVo;
import org.jinku.im.repository.converter.PushSyncParamConverter;
import org.jinku.im.repository.param.PushSyncParam;
import org.springframework.stereotype.Service;

@Service
public class SyncRepositoryImpl implements SyncRepository {

    private final PushSyncParamConverter pushSyncParamConverter;

    public SyncRepositoryImpl(PushSyncParamConverter pushSyncParamConverter) {
        this.pushSyncParamConverter = pushSyncParamConverter;
    }

    @Override
    public void pushSync(SyncVo<?> syncVo) {
        PushSyncParam pushSyncParam = pushSyncParamConverter.convert(syncVo);
        //TODO 请求sync-server
    }
}
