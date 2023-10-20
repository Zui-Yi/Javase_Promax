package com.rx.d5_extends;

import com.rx.d4_singleInstance.Student;

//父类
public class Teacher {
    //公开成员变量、成员方法
    public int i;
    public void print1(){
        System.out.println("---print1---");
    }
    //私有成员
    private int j;
    private void print2(){
        System.out.println("---print2---");
    }

}
