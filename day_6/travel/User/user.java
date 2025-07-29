package day_6.travel.User;
import java.util.ArrayList;
import java.util.Scanner;

import calculator.addsubmuldiv;
import day_6.travel.Booking.ticket;
import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner scanstr=new Scanner(System.in);
        Scanner scanint=new Scanner(System.in);
        ticket object=new ticket();
        System.out.print("Enter Your name: ");
        String name=scanstr.nextLine();
        System.out.print("Conatct no: ");
        long number=scanint.nextLong();
       
        System.out.print("Destination: ");
        String destination=scanstr.nextLine();
        System.out.print("Select Seat number: ");
        int Seatnumber=scanint.nextInt();
        System.out.print("Fare :");
        double fare=scanint.nextDouble();
         object.customerdeatiles(name, number);
      
        object.ticketBoocking("TN-792442",destination,Seatnumber,fare);
        object.ticketBoockingsuccessfullydisplay();
    //     ArrayList <ticket> list=new ArrayList<>();
    //     list.add(object);
    //   for(int i=0;i<list.size();i++){
    //     list.get(i).ticketBoockingsuccessfullydisplay();
    //   }
       
    }
}
