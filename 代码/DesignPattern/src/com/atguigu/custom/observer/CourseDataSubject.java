package com.atguigu.custom.observer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 *  课程数据作为主题
 *
 * @description
 * @author: clt
 * @create: 2021-03-27 09:01
 **/
public class CourseDataSubject implements Subject {

    private Set<Observer> observers = new HashSet<>();

    @Override
    public void publishNotification() {
        for (Observer observer : observers) {
            observer.receiveNotification(this.classTime, this.classCount);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        publishNotification();
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private LocalDateTime classTime;

    private Integer classCount;


    public CourseDataSubject(LocalDateTime classTime, Integer classCount) {
        this.classTime = classTime;
        this.classCount = classCount;
    }

    public Integer getClassCount() {
        return classCount;
    }

    public void setClassCount(Integer classCount) {
        this.classCount = classCount;
        changeData();
    }

    public LocalDateTime getClassTime() {
        return classTime;
    }

    public void setClassTime(LocalDateTime classTime) {
        this.classTime = classTime;
        changeData();
    }

    @Override
    public String toString() {
        return "CourseData{" +
                "classTime=" + classTime +
                ", classCount=" + classCount +
                '}';
    }
}
