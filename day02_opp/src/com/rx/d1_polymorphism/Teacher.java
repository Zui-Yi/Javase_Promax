package com.rx.d1_polymorphism;

public class Teacher extends People{
    public Teacher() {
        //super();// 默认在构造函数的第一行
        System.out.println("来到老师类");
        String name = "子类构造器Teacher的名称";
        System.out.println("111"+name);
    }
    public String name = "子类Teacher的名称";

    @Override
    public void run() {
        System.out.println("老师跑的气喘吁吁~~");
    }
}
