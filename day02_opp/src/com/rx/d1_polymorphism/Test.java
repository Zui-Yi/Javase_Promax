package com.rx.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 目标：认识多态：对象多态，行为多态。
        // 1、对象多态
        People p1 = new Teacher();//运行看右边，先访问子类构造器，然后在第一行super调用父类构造器，访问完成回到子类构造器执行剩余代码
        p1.run(); // 识别技巧：对于方法，编译看左边(能编译运行的前提是p1中有run方法)，运行看右边(运行时优先右边方法即子类重写方法)。
        System.out.println(p1.name);  // 注意：对于变量，编译看左边，运行看左边

        System.out.println("-------------");

        People p2 = new Student();
        p2.run(); // 识别技巧：编译看左边，运行看右边
        System.out.println(p2.name); // 注意：对于变量，编译看左边，运行看左边
    }
}
