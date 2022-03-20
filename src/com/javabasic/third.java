package com.javabasic;

import java.util.Scanner;

public class third {
    //3)Write a Program to Add Two Integer Numbers Entered by
    //take input
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        //perform sum
        int temp = number1 + number2;
        //print value
        System.out.print(temp);


    }


}