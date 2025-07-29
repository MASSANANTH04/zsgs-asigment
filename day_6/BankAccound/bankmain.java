package day_6.BankAccound;

import java.util.Scanner;

public class bankmain {
    public static void main(String[] args) {
        Scanner scanstr=new Scanner(System.in);
        Scanner scanint=new Scanner(System.in);
        int Choice=0;
        double depasite=0;
        double withdraw=0;
        bankdeatiles bankobject=new bankdeatiles();
        System.out.print("Accound Number: ");
        long Account_number=scanint.nextLong();
        System.out.print("Accound Holder Name: ");
        String Account_holder_name=scanstr.nextLine();
        System.out.print("Balance: ");
        double Balance=scanint.nextDouble();
        bankobject.setaccoundseatiles(Account_number, Account_holder_name, Balance);
        bankobject.accounddisplay();
       



        do{
            System.out.println("-------------------------");
            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.Exit");
            System.out.println();
            System.out.print("Customer Choice: ");
            Choice=scanint.nextInt();
            switch(Choice){
                case 1:
                depasite=0;
                withdraw=0;
                System.out.print("Deposide Ammount :");
                depasite=scanint.nextDouble();
                bankobject.setdepasideammount(depasite);
                System.out.println("Your Current Bank Balance: "+bankobject.depasiaddaccound());
                break;
            
            case 2:
            depasite=0;
            withdraw=0;
            System.out.print("Withdraw Ammound: ");
            withdraw=scanint.nextDouble();
            bankobject.setwithdraw(withdraw);
            System.out.println("Current Bank Balance: "+bankobject.withdraw());
            break;

            }
        }while(Choice<3);
        
    }
}
