package org.jinku.im.domain.type;

public enum SessionType {

    SINGLE(1, "单聊"),
    GROUP(2, "群聊")
    ;

    private final int value;
    private final String text;

    SessionType(int value, String text) {
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
