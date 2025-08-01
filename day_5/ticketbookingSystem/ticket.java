//question-4


class ticketbookingmain{
     void booking(){
        System.out.println("Booking bus,Train, Flight");
    }
}
class bus extends ticketbookingmain{
     void booking(){
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
class train extends bus{
    void booking(){
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
class Flight extends train{
    void booking(String name,String contrynamefrom,String contrynameto,double price){
        System.out.println();
        System.out.println("Pasanger name: "+name);
        System.out.println("Contry name To: "+contrynamefrom);
        System.out.println("Contry name From: "+contrynameto);
        System.out.println("Ticket Price: "+price);
        System.out.println("Flight Ticket Booking SuccessFull");
    }
}

public class ticket{
    public static void main(String[] args) {
        bus busobj=new bus();
        train trainobj=new train();
        Flight flightobj=new Flight();
         busobj.booking();
        trainobj.booking();
       flightobj.booking("Ananth", "India", "America", 45000.98);
        
    }

}