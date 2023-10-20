package com.rx.d1_polymorphism;

public class Student extends People{
    public Student() {
        System.out.println("来到学生类");
    }
    public String name = "子类Student的名称";

    @Override
    public void run() {
        System.out.println("学生跑的贼快~~");
    }
}
