package org.jinku.im.application.handler;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public abstract class AbstractReqHandler<T> implements ReqHandler {

    @Override
    public void handReq(Map<String, String> params) {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        handReqObj(JSON.parseObject(JSON.toJSONString(params), type));
    }

    protected abstract void handReqObj(T t);
}
