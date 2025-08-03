package day_7.ticketbooking;
interface ticketbookingmain{
     void booking();
}
abstract class tickecbooking{
    abstract void booking(String name,String contrynamefrom,String contrynameto,double price);
}
class bus implements ticketbookingmain{
    public void booking(){
        String name="Ananth";
        String From="Tenkasi";
        String To="Chennai";
        int price=750;
        System.out.println("Name: "+name);
        System.out.println("From: "+From);
        System.out.println("To :"+To);
        System.out.println("Bus Ticket Booked Successfully");
    }
}
class train implements ticketbookingmain{
  public  void booking(){
        System.out.println();
         String name="Sri";
        String From="Tenkasi";
        String To="Goa";
        double price=1768.43;
        System.out.println("Name: "+name);
        System.out.println("From: "+From);
        System.out.println("To :"+To);
        System.out.println("Train Ticket booking Successfully");
    }
}
class Flight extends tickecbooking{
    public void booking(String name,String contrynamefrom,String contrynameto,double price){
        System.out.println();
        System.out.println("Pasanger name: "+name);
        System.out.println("Contry name To: "+contrynamefrom);
        System.out.println("Contry name From: "+contrynameto);
        System.out.println("Ticket Price: "+price);
        System.out.println("Flight Ticket Booking SuccessFull");
    }
}

public class booking {
    public static void main(String[] args) {
        bus busobj=new bus();
        train trainobj=new train();
        Flight flightobj=new Flight();
         busobj.booking();
        trainobj.booking();
       flightobj.booking("Ananth", "India", "America", 45000.98);
    }
}
