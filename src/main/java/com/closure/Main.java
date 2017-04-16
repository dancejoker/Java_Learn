package com.closure;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class Main {
    public static void main(String[] args) {
            TeachableProgrammer teachableProgrammer = new TeachableProgrammer("Mr wang");
            //直接调用TeachableProgrammer类从Programmer类继承到的work方法
            teachableProgrammer.work();
            //表面上调用的是Closure的work方法，实际上是回调TeachableProgrammer的teach方法
            teachableProgrammer.getCallbackReference().work();
    }
}
