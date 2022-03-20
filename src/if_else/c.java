package if_else;

import java.util.Arrays;
import java.util.Scanner;

public class c {
    //3) Write a Program to Find Largest Number Among Three
    //Numbers entered by users

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int fn=n1.nextInt();
        int sn=n1.nextInt();
        int tn=n1.nextInt();

        if(fn>=sn || fn>=tn){


        }
else if(sn >= fn && sn >= tn){

            System.out.println(sn + " is the largest number.");


        }
        else
            System.out.println(tn + " is the largest number.");

    }


    //Arrays.sort()
}
