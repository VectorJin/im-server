package org.jinku.im.domain.type;

import java.util.Arrays;

public enum  SyncBizType {
    IM(1, "IM聊天");

    int value;
    String text;

    SyncBizType(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
