package org.jinku.im.application.handler;

import org.jinku.im.application.ao.ResultAo;
import org.jinku.im.application.param.CreateGroupChatParam;

/**
 * 建群
 */
public class CreateGroupChatReqHandler extends AbstractReqHandler<CreateGroupChatParam> {

    @Override
    public String supportUrl() {
        return null;
    }

    @Override
    protected ResultAo handReqObj(CreateGroupChatParam createGroupChatParam) {
        return ResultAo.success();
    }
}
