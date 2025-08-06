package day_7.bank;

import calculator.advancecal;
import day_5.override.constroctor;
import day_7.paymentgatwaysystem.paymentgatway;

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
        System.out.println("*****************");
        System.out.println("Customer name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phonenumber);;
        System.out.println("Gmail :"+gmailid);
        System.out.println("Address : "+address);
    }
}
class account{
    long accountnumber;
    String ificcode,brang;
    
    account(long accountnumber,String ificcode ,String brang){
        this.accountnumber=accountnumber;
        this.ificcode=ificcode;
        this.brang=brang;
        
    }
    void accountdisplay(){
        System.out.println("Account Deatiles ");
        System.out.println("****************");
        System.out.println("Account Number: "+accountnumber);
        System.out.println("IFIC Number :"+ificcode);
        System.out.println("Brang: "+brang);
        
    }
}
abstract class  RBI {
   customer cus;
   account acc;
  RBI(customer cus,account acc){
    this.acc=acc;
    this.cus=cus;
    cus.customerdisplay();
    acc.accountdisplay();
   }
   public abstract float intrest();
   public abstract double withdraw();
   public abstract double minumebalance();

}
class SBI extends RBI{
    SBI(customer cus,account acc){
        super(cus,acc);
    }
   public float intrest(){return 12f;}
   public double withdraw(){return 100000d;}
   public double minumebalance(){return 1000;}
   void sbidisplay(){
    System.out.println();
    System.out.print("Intrest : "+intrest()+" "+"Withdray Limite: "+withdraw()+" "+"Minume Balance: "+minumebalance()+"\n");
    System.out.println("----------------------------------------------------------------------------------------------------------");
   }
}
class IOB extends RBI{
    IOB(customer cus,account acc){
        super(cus, acc);
    }
    public float intrest(){return 8f;};
    public double withdraw(){return 50000d;}
    public double minumebalance(){return 0d;}
    void iobdisplay(){
    System.out.println();
    System.out.print("Intrest : "+intrest()+" "+"Withdray Limite: "+withdraw()+" "+"Minume Balance: "+minumebalance()+"\n");
    System.out.println("----------------------------------------------------------------------------------------------------------");
   }
}
class ICIC extends RBI{
    ICIC(customer cus,account acc){
        super(cus, acc);
    }
    public float intrest(){return 19f;};
    public double withdraw(){return 30000;}
    public double minumebalance(){return 100;};
    void icicdisplay(){
    System.out.println();
    System.out.print("Intrest : "+intrest()+" "+"Withdray Limite: "+withdraw()+" "+"Minume Balance: "+minumebalance()+"\n");
    System.out.println("----------------------------------------------------------------------------------------------------------");
   }
}
public class bank {
    public static void main(String[] args) {
        customer customerobj=new customer("Ananth", (short)21, 9600493192l, "asananth04@gmail.com", "11/133 Rama Samy Kovil Street,Vadamalaipatty");
        account accountonj=new account(138001000059601l, "SBI3209","Kadayam");
        customer cusiob=new customer("Sri Rengan", (short)15, 7708218970l, "pcmsri@gmail.com", "Alangulam");
        account acciob=new account(10829389303l, "IOB123d", "Tenkasi");
        customer cusicic=new customer("Malar", (short)19, 9709322833l, "malar07@gmail.com", "Ambai");
        account accicic=new account(1234562812, "ICIC27392", "Chennai");
        System.out.println("-----------------------------SBI----------------------------");
        SBI sbi=new SBI(customerobj, accountonj);
        sbi.sbidisplay();
        System.out.println("------------------------------IOB---------------------------");
        IOB iob=new IOB(cusiob, acciob);
        iob.iobdisplay();
        ICIC icic =new ICIC(cusicic,accicic);
        icic.icicdisplay();
    }
}
