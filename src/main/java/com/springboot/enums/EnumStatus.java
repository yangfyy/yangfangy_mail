package com.springboot.enums;

public enum EnumStatus {
    ONE(200, "操作成功!", "#e2d512"),
    TWO(403, "服务器开小差啦!", "#12ea2f"),
    THREE(500, "网络波动,响应失败请重新加载页面", "#c30910");
    int code;
    String desc;
    String color;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getColor() {
        return color;
    }

    EnumStatus(int code, String desc, String color) {
        this.code = code;
        this.desc = desc;
        this.color = color;
    }

    public static EnumStatus getEnumConstant(int code) {
        for (EnumStatus status : values()) {
            if (code == status.code) {
                return status;
            }
        }
        return ONE;
    }
}
