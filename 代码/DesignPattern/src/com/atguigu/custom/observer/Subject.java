package com.atguigu.custom.observer;

/**
 * @description
 * @author: clt
 * @create: 2021-03-27 09:02
 **/
public interface Subject {
    void publishNotification();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    default void changeData() {
        publishNotification();
    }
}
