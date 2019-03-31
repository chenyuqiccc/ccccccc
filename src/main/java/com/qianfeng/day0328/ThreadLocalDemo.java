package com.qianfeng.day0328;

import com.qianfeng.day0328.goods.entity.Good;

public class ThreadLocalDemo {

    private static ThreadLocal<Good> threadLocal = new ThreadLocal<>();

    public static void main(String [] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Good good = new Good();
                good.setGoodName("千峰java");
                threadLocal.set(good);
                System.out.println("线程1:"+threadLocal.get().getGoodName());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Good good = new Good();
                if(good == null) {
                    good = new Good();
                    threadLocal.set(good);
                }
                System.out.println("线程2 :" +good.getGoodName());
            }
        }).start();
    }
}
