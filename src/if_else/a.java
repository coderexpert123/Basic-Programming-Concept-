package if_else;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        //1) Write a Program to Check Whether Number is Even or Odd
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
         //int number2 = s.nextInt();
        //perform operation

        if(number1%2==0){

            System.out.print("Even");
        }
        else{
            System.out.print("Odd");

        }


    }
}
