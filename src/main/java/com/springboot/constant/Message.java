package com.springboot.constant;

/**
 * @ClassName Message
 * @Author yangfangyuan
 * @Date 2019/4/10 22:41
 * @Version 1.0
 * @Desscription // 信息处理类
 */
public class Message {
    private int code;
    private String desc;

    public Message() {
    }

    public Message(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
