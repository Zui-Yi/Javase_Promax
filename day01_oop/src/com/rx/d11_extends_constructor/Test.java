package com.rx.d11_extends_constructor;

class F{
//    public F(){
//        System.out.println("===父类F的 无参数构造器 执行了===");
//    }

    public F(String name, int age){
        System.out.println("===父类F的 有参数构造器 执行了===");
    }
}

class Z extends F{
    public Z(){
        // super(); // 默认在构造函数的第一行
        super("播妞", 17);
        System.out.println("===子类Z的 无参数构造器 执行了===");
    }

    public Z(String name){
        // super(); // 默认在构造函数的第一行
        super("播妞", 17);
        System.out.println("===子类Z的 有参数构造器 执行了===");
    }
}

public class Test {
    public static void main(String[] args) {
        // 目标：先认识子类构造器的特点，再掌握这个特点的常见应用场景。
        Z z = new Z();
        System.out.println("---------");
        Z z2 = new Z("播妞");
    }
}
