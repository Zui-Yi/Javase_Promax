package com.rx.d3_block;

public class Student {
    static int num=80;
    static String str;

    //静态代码块：
    //类加载时自动执行，由于类只加载一次，所以静态代码块也只执行一次
    //用于完成类的初始化（如类变量初始赋值）
    static {
        System.out.println("执行静态代码块");
        Student.str="张三";
    }

    //实例代码块：
    //每次创建对象时自动执行，且先于构造器执行
    //用于完成对象的初始化（如对实例变量初始赋值）
    //若在有参无参构造器中出现重复代码，可写进实例代码块，简化代码
    {
        System.out.println("执行实例代码块");
        //简化代码，此语句不必分别放入两个构造器中
        System.out.println("有人创建了对象:"+this);
    }

    public Student(){
        System.out.println("执行无参构造器");
    }

    public Student(String name){
        System.out.println("执行有参构造器");
    }





}
