package com.atguigu.custom.decorator;

/**
 * @description
 * @author: clt
 * @create: 2021-03-28 10:59
 **/
public class Main {

    public static void main(String[] args) {
        Fun fun = new PlayInOut();
        fun = new PlayBasketBall(fun);
        fun = new PlayFootBall(fun);
        fun = new RecordFun(fun);
        fun.play();
    }
}
