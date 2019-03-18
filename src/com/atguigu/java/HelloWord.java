package com.atguigu.java;

import com.atguigu.bean.Customer;
import java.util.ArrayList;

public class HelloWord {
    private static final Customer CUS = new Customer();

    public static void main(String[] args) {
        System.out.println("世界，你好！！！");
        System.out.println("helloWorld!!!");
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    
    public static void test(String a,String b) {
        int aa = 1;
        System.out.println("aa = " + aa);
        int bb = 2;
        System.out.println("bb = " + bb);
        String[] myarr = new String[]{"aaa","bbb","ccc"};
        for (String s : myarr) {
            if (s == null) {

            }
            if (s != null) {

            }
            if (s == null) {

            }
            if (s != null) {

            }
            if (s != null) {

            }
        }
    }
}
