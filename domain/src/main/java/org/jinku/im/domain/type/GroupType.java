package org.jinku.im.domain.type;

public enum GroupType {

    SINGLE(1, "单聊"),
    GROUP(2, "群聊")
    ;

    private final int value;
    private final String text;

    GroupType(int value, String text) {
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
