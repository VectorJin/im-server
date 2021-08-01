package org.jinku.im.domain.type;

import java.util.Arrays;

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

    public static GroupType getGroup(int type) {
        return Arrays.stream(GroupType.values())
                .filter(group -> group.getValue() == type)
                .findAny().orElse(null);
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
