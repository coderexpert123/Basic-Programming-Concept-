package if_else;

public class e {
    //5) Write a Program to Check whether a year entered by
    //user is Leap Year or not
    public static  void main(String[] args) {


        int a = 1900;


   if(a%400==0){



            System.out.print("Leap Year");
        }else if(a%100==0){
            System.out.print("Not Leap Year");

        }
   else if(a%4==0) {
       System.out.print(" Leap Year");

   }else{

       System.out.print("Not Leap Year");

   }
    }
}
