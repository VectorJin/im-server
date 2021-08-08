package org.jinku.im.application.server;

import com.google.common.base.Preconditions;
import org.jinku.im.application.ao.ResultAo;
import org.jinku.im.application.handler.ReqHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class HttpBizHandler extends AbstractHttpHandler {

    private final List<ReqHandler> handlerList;

    public HttpBizHandler(List<ReqHandler> handlerList) {
        this.handlerList = handlerList;
    }

    @Override
    public boolean isSupport(String uri) {
        return handlerList.stream().anyMatch(handler -> uri.endsWith(handler.supportUrl()));
    }

    @Override
    public ResultAo doService(String uri, Map<String, String> paramsMap) {
        ReqHandler reqHandler = handlerList.stream()
                .filter(handler -> uri.endsWith(handler.supportUrl()))
                .findFirst().orElse(null);
        Preconditions.checkNotNull(reqHandler);
        return reqHandler.handleReq(paramsMap);
    }
}
