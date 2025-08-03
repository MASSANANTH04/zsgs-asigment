package day_9;

import java.util.InputMismatchException;
import java.util.Scanner;

//question-2
public class exceptionquestion2 {
    public static void main(String[] args) {
         Scanner scanint=new Scanner(System.in);
         Scanner scanstr=new Scanner(System.in);
         int num1=0,num2=0,result=0;
         String str1="",str2="";
         try{
            System.out.print("Enter first number in integer: ");
            num1=scanint.nextInt();
            System.out.print("Enter Secound number is integer: ");
            num2=scanint.nextInt();
            result=num1/num2;
            if(result!=0){
                System.out.print("only number enter:  ");
                str1=scanstr.nextLine();
                num1=Integer.parseInt(str1);
                System.out.print("only number enter:");
                str2=scanstr.nextLine();
                num2=Integer.parseInt(str2);
            }


         }
         catch(InputMismatchException e){
            System.out.println("Please Enter only numbers ");
         }
         catch(ArithmeticException e){
            System.out.println("Zero not divided in any number ");
         }
         catch(NumberFormatException e){
            System.out.println("String to indeger not convert");
         }
         catch(Exception e){
            System.out.println(e);
         }
         System.out.println("Answer is: "+result);
    }
}
