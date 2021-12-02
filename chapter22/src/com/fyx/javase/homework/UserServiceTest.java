package com.fyx.javase.homework;

import java.util.Scanner;

public class UserServiceTest {
    public static void main(String[] args) {
        //创建UserService对象
        UserService userService = new UserService();
        try {
            userService.register("jack","123456");
        } catch (IllegalNameException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
