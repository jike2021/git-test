package com.java.git;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class java {
    public static void main(String[] args) {
        String a = reverse("123456789");
        System.out.println(a);
    }

    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
            return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}