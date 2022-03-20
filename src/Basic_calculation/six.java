package Basic_calculation;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        //  6) Write a Program to Swap Two Numbers
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        //reverse

        int temp= n1;
        n1=n2;
        n2=temp;
        System.out.print(n1+" "+n2);


    }
}
