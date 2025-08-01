//question-2

package day_7.paymentgatwaysystem;

import java.util.Scanner;

interface payment{
    void paymentmethod(double amount);
}
class CreditCardPayment  implements payment{
public void paymentmethod(double amount){
    System.out.println();
    System.out.println("CreditCardPayment "+amount+" was successfully payment");
    
}
}
class DebitCardPayment implements payment{
    public void paymentmethod(double amount){
        System.out.println();
        System.out.println("DebitCardPayment "+amount+" was Successfully payment");
    }
}
class UPIpayment implements payment{
    public void paymentmethod(double transationamount){
        System.out.println();
        System.out.println("UPI Payment :"+transationamount+ " was Succccessfully payment");
    }
}
public class paymentgatway {
    public static void main(String[] args) {
        CreditCardPayment ccardpaymentobj=new CreditCardPayment();
        DebitCardPayment dcardpaymentobj=new DebitCardPayment();
        UPIpayment upaymentobj=new UPIpayment();
        Scanner scanint=new Scanner(System.in);
        int choice=0;
        double amount=0;
        do{
            System.out.println();
            System.out.println("Payment Types");
            System.out.println("******* *****");
            System.out.println("1.CreditCardPayment");
            System.out.println("2.DebitCardPayment");
            System.out.println("3.UPIpayment");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            choice=scanint.nextInt();
            switch(choice){
                case 1:
                System.out.print("Amount :");
                amount=scanint.nextDouble();
                ccardpaymentobj.paymentmethod(amount);
                break;
                case 2:
                System.out.print("Amount: ");
                amount=scanint.nextDouble();
                dcardpaymentobj.paymentmethod(amount);
                break;
                case 3:
                System.out.print("Amount: ");
                amount=scanint.nextDouble();
                upaymentobj.paymentmethod(amount);
                break;
            }
        }while(choice<4);

    }
}
