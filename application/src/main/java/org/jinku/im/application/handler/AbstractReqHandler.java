package org.jinku.im.application.handler;

import com.alibaba.fastjson.JSON;
import org.jinku.im.application.ao.ResultAo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public abstract class AbstractReqHandler<T> implements ReqHandler {

    @Override
    public ResultAo handleReq(Map<String, String> params) {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return handReqObj(JSON.parseObject(JSON.toJSONString(params), type));
    }

    protected abstract ResultAo handReqObj(T t);
}
