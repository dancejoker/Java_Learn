package com.closure;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class Main {
    public static void main(String[] args) {
            TeachableProgrammer teachableProgrammer = new TeachableProgrammer("Mr wang");
            //ֱ�ӵ���TeachableProgrammer���Programmer��̳е���work����
            teachableProgrammer.work();
            //�����ϵ��õ���Closure��work������ʵ�����ǻص�TeachableProgrammer��teach����
            teachableProgrammer.getCallbackReference().work();
    }
}
