package org.jinku.im.repository.converter;

import com.alibaba.fastjson.JSON;
import org.jinku.im.domain.vo.SyncVo;
import org.jinku.im.repository.param.PushSyncParam;
import org.springframework.stereotype.Component;

@Component
public class PushSyncParamConverter {

    public PushSyncParam convert(SyncVo<?> syncVo) {
        PushSyncParam pushSyncParam = new PushSyncParam();
        pushSyncParam.setCreatorType(syncVo.getCreatorType().getValue());
        pushSyncParam.setCreatorId(syncVo.getCreatorId());
        pushSyncParam.setBizType(syncVo.getBizType().getValue());
        pushSyncParam.setBizUuid(syncVo.getBizUuid());
        pushSyncParam.setDataJson(JSON.toJSONString(syncVo.getBizData()));
        return pushSyncParam;
    }
}
