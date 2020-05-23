package com.wwy.utils;

import java.util.Arrays;

/**
 * @Auther: wwy
 * @Date: 2020/5/19 22:40
 * @Description: com.wwy.utils
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        int a =10;
        int b=20;
        int c= 30;
        int[] arr = new int[4];
        arr[0]=11;
        arr[1]=56;
        arr[2]=98;
        arr[3]=66;
        Arrays.toString(arr);
        int eat = eat();
        System.out.println(eat);

    }

    public static int  eat(){
        System.out.println("---1");
        System.out.println("---2");
        return 11111;
    }


}
