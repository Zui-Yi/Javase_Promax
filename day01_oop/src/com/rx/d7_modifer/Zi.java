package com.rx.d7_modifer;

import com.rx.d6_modifer.Fu;

public class Zi extends Fu {
    public void test(){
        // privateMethod(); // 报错
        // method(); // 报错
        protectedMethod();
        publicMethod();
    }
}
