package org.jinku.im.repository;

import com.google.common.collect.Lists;
import org.jinku.im.domain.repository.SyncRepository;
import org.jinku.im.domain.vo.SyncVo;
import org.jinku.im.repository.converter.PushSyncParamConverter;
import org.jinku.im.repository.param.PushSyncParam;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SyncRepositoryImpl implements SyncRepository {

    private final PushSyncParamConverter pushSyncParamConverter;

    public SyncRepositoryImpl(PushSyncParamConverter pushSyncParamConverter) {
        this.pushSyncParamConverter = pushSyncParamConverter;
    }

    @Override
    public void pushSync(SyncVo<?>[] syncVos) {
        List<PushSyncParam> pushSyncParams = Lists.newArrayList(syncVos).stream()
                .map(pushSyncParamConverter::convert).collect(Collectors.toList());
        //TODO 请求sync-server
    }
}
