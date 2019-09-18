package com.mj.sticky.frame.observer;


/**
 * Created by Aron on 2017/9/28.
 */

public class EventMsg {
    private String flag;//信息标识
    private String flagValue;
    private Object msg; //事件发出的消息
    private String from; //哪里发出的事件

    public EventMsg(String flag, String flagValue, Object msg, String from) {
        this.flag = flag;
        this.flagValue = flagValue;
        this.msg = msg;
        this.from = from;
    }

    public EventMsg(String flag, Object msg, String from) {
        this.flag = flag;
        this.msg = msg;
        this.from = from;
    }

    public EventMsg(String flag, String from) {
        this.flag = flag;
        this.from = from;
    }

    public String getFlagValue() {
        return flagValue;
    }

    public String getFlag() {
        return flag;
    }

    public Object getMsg() {
        return msg;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "EventMsg{" +
                "flag='" + flag + '\'' +
                ", flagValue='" + flagValue + '\'' +
                ", msg=" + msg +
                ", from='" + from + '\'' +
                '}';
    }
}
