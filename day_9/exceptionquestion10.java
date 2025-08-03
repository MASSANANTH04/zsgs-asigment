package day_9;

import java.util.InputMismatchException;
import java.util.Scanner;

class Invalidageexceptionnn extends Exception{
   Invalidageexceptionnn(String exption){
    super(exption);
   }
}
class age{
    void chick(int age){
        try{
            if(age<18){
                throw new Invalidageexceptionnn("Your Not Eligible For voting...!");
            }
            else{
            System.out.println("Your Eligeble for voting");
        }
        }
        catch(Invalidageexceptionnn e){
            System.out.println(e);
        }
    }
}

public class exceptionquestion10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=0;
        
        try{
           age=scan.nextInt();
        age a=new age();
        a.chick(age);
        }
        catch(InputMismatchException d){
             System.out.println("Only number Enter..");
        }
    }
}
