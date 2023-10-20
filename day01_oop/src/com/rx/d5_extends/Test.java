package com.rx.d5_extends;

public class Test {
    public static void main(String[] args) {
        Teacher te1=new Teacher();
        Student stu1=new Student();
        te1.print1();
        stu1.print1();//继承父类的print1
        //te1.print2();//私有
        //stu1.print2();//私有
        //te1.print3();
        stu1.print3();
    }
}
