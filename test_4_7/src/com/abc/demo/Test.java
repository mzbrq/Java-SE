package com.abc.demo;

public class Test {
    public String name;
    public int age;
    //就地初始化
    private static String sex = "female";

    public static String getSex() {
        return sex;
    }

    public static void main(String[] args) {
        //推荐使用类名 . 类变量名 进行访问
        System.out.println(Test.sex);

        //使用静态方法访问静态成员变量
        System.out.println(getSex());

        //静态方法中，不能直接访问非静态成员
        System.out.println(age);
    }
}
