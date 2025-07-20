

public class student {
    String name;
    int rollno;
    public static void main(String args[]){
        student obj=new student();
       String accesname= obj.name="Ananth";
       int accesrollno= obj.rollno=22669;
       System.out.println("Name is: "+accesname);
       System.out.println("Rollno: "+accesrollno);
        
    }
    
}
