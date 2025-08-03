package day_9;

import java.util.InputMismatchException;
import java.util.Scanner;

//question-6
public class exceptionquestion6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Your Pin Limite: ");
        int pin=scan.nextInt();
        int arr[]=new int[pin];
        int chick=0;
        try{
            chick=1;
            for(int i=0;i<pin;i++){
                System.out.print("Enter Pin: ");
                arr[i]=scan.nextInt();
            }
            if(arr.length==5 || arr.length<4){
                throw new ArrayIndexOutOfBoundsException();
            }
            if(arr[0]==0){
               throw new IllegalAccessError();
            }
        }
        catch(InputMismatchException r){
            chick=0;
            System.out.println("Atm Pin Only Number Please Enter Number...");
        }
        catch(IllegalAccessError d){
            chick=0;
            System.out.println("Pin Must Not Start With 0");
        }
        catch(ArrayIndexOutOfBoundsException f){
            chick=0;
            System.out.println("Pin  must be exactly 4 digits long.");
        }
        finally{
            if(chick!=0){
                System.out.println("Your Pin is Valid");
            }
            else{
                System.out.println("Your pin invalid..");
            }
        }
    }
}
