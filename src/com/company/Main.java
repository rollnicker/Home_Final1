package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Input, Value, Base, last;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в двоичном формате: ");
        Input = scan.nextInt();
        Value = 0;
        Base = 1;
        while (Input > 0) {
            last = Input % 10;
            Input = Input / 10;
            Value += last * Base;
            Base = Base * 2;
        }
        System.out.println("Полученное число в десятичном формате: " + Value);
    }
}