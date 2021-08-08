package org.jinku.im.application.handler;

import org.jinku.im.application.ao.ResultAo;

import java.util.Map;

public interface ReqHandler {

    String supportUrl();

    ResultAo handleReq(Map<String, String> params);
}
