//question -3
package day_7.employescompany;
abstract class Employee{
    String name;
    String workingtype;
    Employee(String name,String workingtype){
        System.out.println("                     Employee Deatiles");
        this.name=name;
        this.workingtype=workingtype;
        
    }
    abstract void calculatesalary();
}
class Fulltimeemployee extends Employee{
    double salary;
    Fulltimeemployee(String name,String workingtype,double salaey){
        super(name,workingtype);
        this.salary=salaey;
        System.out.println("-------------------------------------------------");
        System.out.println("                FullTime Employee");
        System.out.println("                ^^^^^^^^ ^^^^^^^^");
        System.out.println("Employee Name: "+name);
        System.out.println("Employee working type: "+workingtype);
        System.out.println("Salary per Month: "+salaey);
        System.out.println("--------------------------------------------------");
    }
    void calculatesalary(){
        
        System.out.println("Employee Salary per Year: "+salary*12);
        System.out.println("***************************************************");
    }
}
class parttimeemployee extends Employee{
    int workinghours;
    double workhourpersalary;
      parttimeemployee(String name,String workingtype,int workinghours,double workhourpersalary){
        super(name,workingtype);
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
    void calculatesalary(){
        System.out.println();
        System.out.println("Partime Employe Salary per month: "+(25*workhourpersalary));
    }
}
public class employecompany {
    public static void main(String[] args) {
        Employee emp1=new Fulltimeemployee("Ananth","Fulltime",30000.78);
        emp1.calculatesalary();
        Employee emp2=new parttimeemployee("Sri Rengan", "Parttime", 5, 1200);
        emp2.calculatesalary();
    }
}
