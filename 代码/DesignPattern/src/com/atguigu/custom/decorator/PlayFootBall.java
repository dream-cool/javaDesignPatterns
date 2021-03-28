package com.atguigu.custom.decorator;

/**
 * @description
 * @author: clt
 * @create: 2021-03-28 11:00
 **/
public class PlayFootBall implements Fun {

    private Fun fun;

    public PlayFootBall(Fun fun) {
        this.fun = fun;
    }

    @Override
    public void play() {
        fun.play();
        System.out.println("play foot ball");
    }
}
