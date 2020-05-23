package com.wwy;

import java.io.Serializable;
import java.util.Arrays;

public class TestClass01 implements Serializable {

    private static final long serialVersionUID = -6073106136885636398L;


    private  int age;
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public int getAge() {
        for (int i = 0; i < 10; i++) {
            String s = Arrays.toString(new int[]{1, 2, 3});
            System.out.println(s);
        }

        return age;
    }

    public TestClass01(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public TestClass01(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
