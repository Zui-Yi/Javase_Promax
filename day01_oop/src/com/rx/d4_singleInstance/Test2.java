package com.rx.d4_singleInstance;

public class Test2 {
    public static void main(String[] args) {
        Teacher te1=Teacher.getInstance();
        Teacher te2=Teacher.getInstance();
        System.out.println(te1==te2);
    }
}
