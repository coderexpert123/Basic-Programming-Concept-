package if_else;

import java.util.Scanner;

public class b {
    //2) Write a Program to Check Whether a Character is Vowel or Consonant.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        //vowel=a,e,i,o,u
        //con=rest of vowel

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + "  consonant");

    }
}
