package com.rx.d1_staticvariable;

public class Test {
    public static void main(String[] args) {
        Student.name="袁华";

        Student s1=new Student();
        s1.name="张三";

        Student s2=new Student();
        s2.name="李四";

        System.out.println(s1.name);
        System.out.println(Student.name);

        s1.age=23;
        s2.age=21;
        System.out.println(s1.age);
        System.out.println(s2.age);


    }
}

