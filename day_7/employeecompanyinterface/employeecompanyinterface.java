package day_7.employeecompanyinterface;
interface employee{
    void calculatesalary();
}
class Fulltimeemployee implements employee{
    double salary;
   Fulltimeemployee(  String name,String workingtype,double salaey){
    this.salary=salaey;
        System.out.println("-------------------------------------------------");
        System.out.println("                FullTime Employee");
        System.out.println("                ^^^^^^^^ ^^^^^^^^");
        System.out.println("Employee Name: "+name);
        System.out.println("Employee working type: "+workingtype);
        System.out.println("Salary per Month: "+salaey);
        System.out.println("--------------------------------------------------");
   }
 public void calculatesalary(){
        System.out.println("Employee Salary per Year: "+salary*12);
        System.out.println("***************************************************");
    }
}
class parttimeemployee implements employee{
    int workinghours;
    double workhourpersalary;
    parttimeemployee(String name,String workingtype,int workinghours,double workhourpersalary){
        this.workinghours=workinghours;
        this.workhourpersalary=workhourpersalary;
        System.out.println("-------------------------------------------------");
        System.out.println("                PartTime Employee");
        System.out.println("                ^^^^^^^^ ^^^^^^^^");
        System.out.println("Employee Name: "+name);
        System.out.println("Employee working type: "+workingtype);
        System.out.println("Working Time houre: "+workinghours);
        System.out.println("Salary  hours: "+workhourpersalary);
        System.out.println("--------------------------------------------------");
    }
    public void calculatesalary(){
         System.out.println();
        System.out.println("Partime Employe Salary per month: "+(25*workhourpersalary));
    }
}

public class employeecompanyinterface {
    public static void main(String[] args) {
        Fulltimeemployee fobj=new Fulltimeemployee("Ananth", "Full timt", 23000);
        fobj.calculatesalary();
        parttimeemployee pobj=new parttimeemployee("Mani kandan", "part Time", 5, 1000);
        pobj.calculatesalary();
    }
}
