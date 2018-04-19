package com.example.demo;

import java.util.Objects;

public class NonNullExample {

    public static void main(String... args) {
        String str = null;
        //equivalent to obj != null;
        boolean b = Objects.nonNull(str);
        System.out.println(b);
    }
}
