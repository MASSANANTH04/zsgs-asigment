package day_6.payment;

public class privatedata {
   private String transaction_id;
   private String payer_name;
   private String pay_name;
   private double amound;
   private String payment_method;
   private String transtion_status;
   void setvalue(String transaction_id,String payer_name,String pay_name,double amound,String payment_method){
    this.transaction_id=transaction_id;
    this.payer_name=payer_name;
    this.pay_name=pay_name;
    this.amound=amound;
    this.payment_method=payment_method;
   }
   void setpayment(String transtion_status){
    this.transtion_status=transtion_status;
   }
   
   void displaytransaction(){
    System.out.println("TRANSATION DEATILES");
    System.out.println("********** ********");
    System.out.println("Transaction ID                   : "+transaction_id);
    System.out.println("Payer Name                       : "+payer_name);
    System.out.println("Amount                           : "+amound);
    System.out.println("Payment Method                   : "+payment_method);
    System.out.println("Transaction Status               : "+transtion_status);
    // System.out.println();
    System.out.println("-----------------------------------------------------");
   }

}

