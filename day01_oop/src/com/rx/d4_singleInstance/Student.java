package com.rx.d4_singleInstance;

//单例设计模式：确保一个类只有一个对象
//饿汉式单例：拿对象时，对象已经创建好了
public class Student {
    //2、定义一个私有类变量，记住类的一个对象
    private static Student stu=new Student();

    //1、私有类的构造器,确保不能被外部直接调用
    private Student(){

    }

    //3、定义一个类方法，为外部调用，返回唯一一个类的对象
    public static Student getObject(){
        System.out.println("stu:"+stu);
        return stu;
    }


}
