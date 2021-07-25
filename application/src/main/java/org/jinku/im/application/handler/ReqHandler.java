package org.jinku.im.application.handler;

import java.util.Map;

public interface ReqHandler {

    String supportUrl();

    void handReq(Map<String, String> params);
}
