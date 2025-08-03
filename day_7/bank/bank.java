package day_7.bank;

import day_5.override.constroctor;

class customer{
    String name;
    short age;
    long phonenumber;
    String gmailid;
    String address;
    customer(String name,short age,long phonenumber,String gmailid,String address){
        this.name=name;
        this.age=age;
        this.phonenumber=phonenumber;
        this.gmailid=gmailid;
        this.address=address;
    }
    void customerdisplay(){
        System.out.println("Customer Deatiles...");
        System.out.println("Customer name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phonenumber);;
        System.out.println("Gmail :"+gmailid);
        System.out.println("Address : "+address);
    }
}
class account{
    long accountnumber;
    String ificcode;
    double balance;
    account(long accountnumber,String ificcode){
        this.accountnumber=accountnumber;
        this.ificcode=ificcode;
        
    }
    void accountdisplay(){
        System.out.println("Account Deatiles ");
        System.out.println("Account Number: "+accountnumber);
        System.out.println("IFIC Number :"+ificcode);
        
    }

}
abstract class  RBI {
   

}
public class bank {
    public static void main(String[] args) {
        customer customerobj=new customer("Ananth", (short)21, 9600493192l, "asananth04@gmail.com", "11/133 Rama Samy Kovil Street,Vadamalaipatty");
    }
}
