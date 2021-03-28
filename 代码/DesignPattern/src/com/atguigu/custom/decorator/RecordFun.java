package com.atguigu.custom.decorator;

/**
 * @description
 * @author: clt
 * @create: 2021-03-28 11:04
 **/
public class RecordFun implements Fun {

    private Fun fun;

    public RecordFun(Fun fun) {
        this.fun = fun;
    }

    @Override
    public void play() {
        System.out.println("starting play");
        fun.play();
        System.out.println("ending play");
    }
}
