package day_6.payment;

public class mainpayment {
    public static void main(String[] args) {
        privatedata p=new privatedata();
        p.setvalue("UP-65473822", "Ananth", "Flipkart", 15070.98, "UPI");
        p.setpayment("Success");
        p.displaytransaction();
    }
}
