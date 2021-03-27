package com.atguigu.custom.observer;

import java.time.LocalDateTime;

/**
 * @description
 * @author: clt
 * @create: 2021-03-27 09:02
 **/
public interface Observer {

    /**
     *  此处不应接受主题数据， 会导致引用传递，则观察者一旦持有某个主题的引用后
     *  即便它不在通知列表中，主要主题数据更新，它持有的引用数据也将更新
     *
     * @param data
     */
    @Deprecated
    void receiveNotification(Subject data);

    void receiveNotification(LocalDateTime dateTime, Integer count);
}
