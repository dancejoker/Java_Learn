package com.closure;

/**
 * Created by Administrator on 2017/4/16 0016.
 */

/**
 * 假设现在有一个人，既是一个程序员，
 * 也是一个教师。也就是说需要定义一个特殊的类，
 * 既需要实现Teachable接口，也需要继承Programmer父类。
 * 表面上看起来这没有任何问题，问题是Teachable接口和Programmer父类里包含了相同的work方法,
 *如果采用如下代码来定义一个特殊的TeachableProgrammer类：
 */
/*
public class TeachableProgrammer extends Programmer implements Teachable {

//    可以发现：TeachableProgrammer类只有一个work方法，
//    这个work方法只能进行“教学”，不再可以进行“编程”。
//    但实际需要TeachableProgrammer类里既包含“教学”的work方法，也包含“编程”的work方法
    public void work(){
        System.out.println(super.getName() + "教师在讲台上讲解...");
    }

//这里我们可以使用仿闭包类来实现
}*/
//这里我们可以使用仿闭包类来实现
public class TeachableProgrammer extends Programmer{
    public TeachableProgrammer(){}
    public TeachableProgrammer(String name){
        super(name);
    }
    //教学工作依然由TeachableProgramer类定义
    private void teach(){
        System.out.println(getName() + "教室在讲台上讲解......");
    }
    private class Closure implements Teachable{
        public void work() {
            teach();
        }
    }

    public Teachable getCallbackReference(){
        return  new Closure();
    }
}