package day_6.BankAccound;

import inventry_system.product;
import store.prodict;

public class bankdeatiles {
    private long Account_number;
    private String Account_holder_name;
    private double Balance;
    protected double depasideammount;
    protected double withdrawammount;


    protected void setaccoundseatiles(long Account_number,String Account_holder_name,double Balance){
        this.Account_number=Account_number;
        this.Account_holder_name=Account_holder_name;
        this.Balance=Balance;
    }
    protected void accounddisplay(){
        System.out.println();
        System.out.println("Accound Number :"+Account_number);
        System.out.println("Account Holder Name: "+Account_holder_name);
        System.out.println("Bank Balance: "+Balance);
        System.out.println();
    }
    protected long getAccountnumber(){
        return Account_number;
    }
    protected String getAccountholdername(){
        return Account_holder_name;
    }
    protected double getaccountbalance(){
        return Balance;
    }
    //--------------DEPASIT----------------------------------
    protected void setdepasideammount(double depasideammount){
        this.depasideammount=depasideammount;
    }
    protected double depasiaddaccound(){
    return Balance+=depasideammount;
}
    //------------------------------------------------

//-----------------Withdraw-------------------------------
protected void setwithdraw(double withdraw){
    withdrawammount=withdraw;
}
protected double withdraw(){
    if(Balance>withdrawammount){
        return Balance=Balance-withdrawammount;
    }
    else{
        return 0;
    }
}
}
