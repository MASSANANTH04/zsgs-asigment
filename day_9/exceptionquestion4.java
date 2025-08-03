package day_9;

import java.util.Scanner;
class demo{
    void parsetostringint(String a){
        int ans=Integer.parseInt(a);
        System.out.println("Answer is: "+ans);
    }
}
//question-4
public class exceptionquestion4 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter  Number: ");
       String value=scan.nextLine();
       demo obj=new demo();
       try{
       obj.parsetostringint(value);
       }
       catch(NumberFormatException s){
        System.out.println("Please Enter only Number...");
       }
    }
}
