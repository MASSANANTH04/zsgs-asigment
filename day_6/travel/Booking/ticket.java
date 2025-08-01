package day_6.travel.Booking;
import day_6.travel.User.user;

public class ticket {

    public String ticket_id;
    public int seat_number;
    public String destination;
    public double fare;

    public void ticketBoocking(String ticket_id,String destination, int seat_number,double fare){
        this.ticket_id=ticket_id;
        this.destination=destination;
        this.seat_number=seat_number;
        this.fare=fare;
    }
    //--------------------------------------
    public String name;
  public  long number;
    public void customerdeatiles(String name,long number){
        this.name=name;
        this.number=number;
    }
    public void customerdeatilesdisplay(){
        System.out.println("Name: "+name);
        System.out.println("Number: "+number);
    }
    //------------------------------------------
    public void ticketBoockingsuccessfullydisplay(){
        System.out.println();
        System.out.println("****************************************");
        System.out.println("                TICKET");
        System.out.println("                ^^^^^^");
        System.out.println();
        customerdeatilesdisplay();
        System.out.println("Ticket ID Number: "+ticket_id);
        System.out.println("DESTINATION :"+destination);
        System.out.println("Seat Number: "+seat_number);
        System.out.println("Fare"+fare);
        System.out.println();
        System.out.println("                                                Ticket Book SuccessFully...!");
        System.out.println();
        System.out.println("****************************************");
    }
}
