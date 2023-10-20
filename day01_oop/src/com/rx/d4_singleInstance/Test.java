package com.rx.d4_singleInstance;

public class Test {
    public static void main(String[] args) {
        //Student stu1/2返回的永远都是同一个私有类变量stu
        Student stu1=Student.getObject();
        System.out.println("stu1:"+stu1);
        Student stu2=Student.getObject();
        System.out.println("stu1:"+stu1);
        System.out.println("stu2:"+stu2);
    }
}
