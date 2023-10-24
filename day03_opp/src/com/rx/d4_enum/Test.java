package com.rx.d4_enum;

public class Test {
    public static void main(String[] args) {
        // 目标：认识枚举类。
        // A.X = null;
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;

        A[] arr=A.values();
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        System.out.println(a1);
        System.out.println(a1.ordinal());
        a1.setName("哈哈哈");
        System.out.println(a1.getName());//
    }
}
