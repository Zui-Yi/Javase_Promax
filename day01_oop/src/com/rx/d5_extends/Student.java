package com.rx.d5_extends;
//子类
public class Student extends Teacher{
    //子类可以继承父类的非私有成员
    private  int k;

    public void print3(){
        System.out.println(i);
        System.out.println("---print3---");
        //私有成员无法访问
        //System.out.println(j);
        //print2();
    }
}