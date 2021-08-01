package org.jinku.im.domain.type;

public enum SyncCreatorType {
    USER(1, "用户");

    int value;
    String text;

    SyncCreatorType(int value, String text) {
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
