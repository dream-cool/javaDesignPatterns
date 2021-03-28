package com.atguigu.custom.decorator;

/**
 * @description
 * @author: clt
 * @create: 2021-03-28 11:02
 **/
public class PlayBasketBall implements Fun {

    private Fun fun;

    public PlayBasketBall(Fun fun) {
        this.fun = fun;
    }

    @Override
    public void play() {
        fun.play();
        System.out.println("playing basket ball");
    }
}
