package com.wwy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: wwy
 * @Date: 2020/5/19 21:48
 * @Description: com.wwy
 * @version: 1.0
 */
public class TestClass02 {
    
    private static final int AGE=10;
//    public static final

    public void test1 (){

    }
    public static void main(String[] args) {
        
        TestClass01 testClass01 = new TestClass01(1,"2");
        testClass01.getAge();
        System.out.println("testClass01 = " + testClass01);
        System.out.println("TestClass02.main");
        System.out.println("args = " + Arrays.deepToString(args));
    }
//    处理循环
    public void a (){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        int[] arr = {12,42,1};
        for (int i = 0; i < arr.length; i++) {
            
            
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            
            
        }

        for (int i : arr) {
            
        }

        for (int i : arr) {
            
        }


        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        


    }
    
    public void d (){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        if (list == null) {
            
        }

        if (list != null) {
            
        }

        if (list == null) {
            
            
        }
        
        
    }
}
