package Basic_calculation;

import java.util.Scanner;

public class fourth {

    public static void main(String[] args){

        /*4) Write a program where the user is asked to enter two integers (divisor and dividend) and the quotient
        and the ould be integers */


        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();

        //divisior
        int tempn1=n1/n2;
        //Quotient
        int quotient=n1%n2;

        System.out.println("Divisor: "+tempn1);
        System.out.println(quotient);




    }
}
