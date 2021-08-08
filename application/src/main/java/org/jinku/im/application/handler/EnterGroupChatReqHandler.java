package org.jinku.im.application.handler;

import org.jinku.im.application.ao.ResultAo;
import org.jinku.im.application.param.EnterGroupChatParam;

/**
 * 进群
 */
public class EnterGroupChatReqHandler extends AbstractReqHandler<EnterGroupChatParam> {
    @Override
    protected ResultAo handReqObj(EnterGroupChatParam enterGroupChatParam) {
        return ResultAo.success();
    }

    @Override
    public String supportUrl() {
        return null;
    }
}
