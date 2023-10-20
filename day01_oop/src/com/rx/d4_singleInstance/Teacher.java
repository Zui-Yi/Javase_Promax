package com.rx.d4_singleInstance;

//懒汉式单例：拿对象时，才开始创建唯一对象
public class Teacher {
    //2、定义一个私有类变量，此时不创建对象
    private static Teacher te;
    //1、私有类的构造器,确保不能被外部直接调用
    private Teacher(){

    }
    //3、定义一个类方法，只有第一次调用时才创建对象，且返回唯一一个类的对象
    public static Teacher getInstance(){
        if (te==null){
            te=new Teacher();
        }
        return te;
    }


}
