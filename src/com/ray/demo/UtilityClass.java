package com.ray.demo;

public class UtilityClass {
    private UtilityClass(){
        throw new AssertionError();//主要是避免在类的内部被使用
    }
}
