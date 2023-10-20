package com.rx.d2_staticmethod;

public class Test {
    public static void main(String[] args) {

        Student.printHelloWorld();//类名直接访问类方法

        Student s1=new Student();
        s1.printHelloWorld();//实例对象访问类方法，不推荐

        s1.printHelloWorld2();//实例对象访问实例方法


    }
}
