package com.atguigu.custom.observer;

import java.time.LocalDateTime;

/**
 * @description
 * @author: clt
 * @create: 2021-03-27 09:14
 **/
public class Main {

    public static void main(String[] args) {
        CourseDataSubject subject = new CourseDataSubject(LocalDateTime.now(), 8);
        StudentObserver studentObserver = new StudentObserver();
        EnglishTeacherObserver englishTeacherObserver = new EnglishTeacherObserver();
        subject.addObserver(studentObserver);
        subject.addObserver(englishTeacherObserver);
        subject.publishNotification();

        studentObserver.viewCourseData();
        englishTeacherObserver.viewCourseData();

        subject.setClassCount(5);
        System.out.println("---- year the data has changed.");
        studentObserver.viewCourseData();
        englishTeacherObserver.viewCourseData();

        MathTeacherObserver mathTeacherObserver = new MathTeacherObserver();
        subject.addObserver(mathTeacherObserver);

        System.out.println("--- year math has benn added.");
        studentObserver.viewCourseData();
        englishTeacherObserver.viewCourseData();
        mathTeacherObserver.viewCourseData();

        subject.setClassCount(0);
        System.out.println("--- year the data has changed again.");
        studentObserver.viewCourseData();
        englishTeacherObserver.viewCourseData();
        mathTeacherObserver.viewCourseData();

        subject.removeObserver(studentObserver);
        subject.setClassCount(100);
        System.out.println("--- year the studentObserver has been removed and the data has changed again.");
        studentObserver.viewCourseData();
        englishTeacherObserver.viewCourseData();
        mathTeacherObserver.viewCourseData();

    }
}
