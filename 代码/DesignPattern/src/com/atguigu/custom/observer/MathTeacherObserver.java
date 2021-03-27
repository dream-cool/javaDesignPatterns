package com.atguigu.custom.observer;

import java.time.LocalDateTime;

/**
 * @description
 * @author: clt
 * @create: 2021-03-27 09:10
 **/
public class MathTeacherObserver implements Observer, CourseTable {

    public Subject subject;

    public LocalDateTime classTime;

    public Integer classCount;

    @Override
    public void receiveNotification(Subject data) {
        this.subject = data;
    }

    @Override
    public void receiveNotification(LocalDateTime dateTime, Integer count) {
        this.classTime = dateTime;
        this.classCount = count;
    }

    @Override
    public void viewCourseData() {
        System.out.println(this.getClass().getSimpleName() + "---" + this.classTime +"---" + this.classCount);
    }

    @Override
    public String toString() {
        return "Math teacher";
    }
}
