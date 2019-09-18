package com.mj.sticky.frame.observer;

/**
 * Created by Aron on 2017/9/28.
 * 观察者接口
 */

public interface Observer {
    void update(EventMsg obj); //同notify()的意义，当观察者接收到消息时执行的更新方法
}
