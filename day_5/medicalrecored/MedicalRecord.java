package day_5.medicalrecored;

import java.util.Scanner;

class medicalrecordmain{
String recordId="GOV-2025/476";
   String patient_name;
   String date_of_visite;
   String diagnosis;
  public void inputrecoredeatiles(String patient_name,String date_of_visite,String diagnosis){
    this.patient_name=patient_name;
    this.date_of_visite=date_of_visite;
    this.diagnosis=diagnosis;
   }
  public void displayrecord(){
    System.out.println("                                   Medical Record");
    System.out.println("                                   ******* ******");
    System.out.println("Pasent Record Number: "+recordId);
    System.out.println("Pasent Name: "+patient_name);
    System.out.println("Date Of Visite: "+date_of_visite);
    System.out.println("Diagnosis: "+diagnosis);
    System.out.println("------------------------------------------------------------------------");
   }
  
}
class inpasentrecore extends medicalrecordmain{
    int roomnumber=24;
    int numberofdayadmite=5;
    double roomcharges=900;
    void calclatetotalromcharges(){
        System.out.println("Total Room Charges: "+(numberofdayadmite*roomcharges));
    }
   public void displayrecord(){
        super.displayrecord();
        System.out.println("                                            Total Rome Charges...");
        System.out.println("                                             **** **** ********");
        System.out.println();
        System.out.println("Roome number: "+roomnumber);
        System.out.println("Numer of day Admite: "+numberofdayadmite);
        System.out.println("Room Charges Per Day: "+roomcharges);
        calclatetotalromcharges();
    }

}
class outpasentrecord extends medicalrecordmain{
    String doctorname="Dr.Anthony";
    Double consultationFee=20000.89;
    public void displayrecord(){
        super.displayrecord();
         System.out.println("                                            specific Deatiles...");
         System.out.println("                                            ******** ********");
         System.out.println("Doctor Name: "+doctorname);
         System.out.println("consultationFee: "+consultationFee);
    }
}
public class MedicalRecord {
    public static void main(String[] args) {
        Scanner scanstr=new Scanner(System.in);
        medicalrecordmain medicalrecordobj=new inpasentrecore();
        medicalrecordmain ourpasentobj=new outpasentrecord();
        



        System.out.print("Enter Pasent name: ");
        String pasentname=scanstr.nextLine();
        System.out.print("Date of Joining: ");
        String dateofjoining=scanstr.nextLine();
        System.out.print("diagnosis: ");
        String diagnosis=scanstr.nextLine();
         medicalrecordobj.inputrecoredeatiles(pasentname, dateofjoining, diagnosis);
       
        medicalrecordobj.displayrecord();
        ourpasentobj.inputrecoredeatiles(pasentname, dateofjoining, diagnosis);
        ourpasentobj.displayrecord();
        

        
    }
}
