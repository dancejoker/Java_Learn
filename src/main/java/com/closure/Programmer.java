package com.closure;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
//程序员类
public class Programmer {
    private String name;

    public Programmer() {
    }

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println(name + "在灯下认真敲键盘...");
    }
}
