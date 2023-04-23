package model;

import java.util.HashMap;
import java.util.Map;

public enum RoomType {
    SINGLE("Single"),
    DOUBLE("Double");

    private final String label;
    private static final Map<String, RoomType> BY_LABEL = new HashMap<>();

    static {
        for (RoomType rt : values()) {
            BY_LABEL.put(rt.label, rt);
        }
    }

    private RoomType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static RoomType valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
}
