//question-3




package day_5.employesystem;
abstract class employe{
  abstract void calculatesalary();
}
class fulltimeemployee extends employe{
void calculatesalary(){
    String Employee_name="Ananth";
    String Employee_role="Test";
    String Employee_work_type="Full Time";
    String Employee_working_hours="Morning 9 Am to Evening 6 Pm";
    double Employee_salary=45000.78;
    System.out.println("                                  FullTime Employee");
    System.out.println("                                  ^^^^^^^^ ^^^^^^^^");
    System.out.println();
    System.out.println("Employee Name :                      "+Employee_name);
    System.out.println("Employee Role:                       "+Employee_role);
    System.out.println("Working Type part/Full Time:         "+Employee_work_type);
    System.out.println("Working Time:                        "+Employee_working_hours);
    System.out.println("Salary:                              "+Employee_salary);
    System.out.println();
}
}
class parttimeemployee extends employe{
    void calculatesalary(){
    String Employee_name="Sri Rengan";
    String Employee_role="Android Developer";
    String Employee_work_type="Part Time";
    String Employee_working_hours="Morning 10 Am to 12 Am";
    double Employee_salary=23000.78;
    System.out.println("                                  PartTime Employee");
    System.out.println("                                  ^^^^^^^^ ^^^^^^^^");
    System.out.println();
    System.out.println("Employee Name :                      "+Employee_name);
    System.out.println("Employee Role:                       "+Employee_role);
    System.out.println("Working Type part/Full Time:         "+Employee_work_type);
    System.out.println("Working Time:                        "+Employee_working_hours);
    System.out.println("Salary:                              "+Employee_salary);

    }
}
public class Employeee {
    public static void main(String[] args) {
        fulltimeemployee employeefulltime=new fulltimeemployee();
        parttimeemployee employeeparttime=new parttimeemployee();
        employeefulltime.calculatesalary();
        employeeparttime.calculatesalary();
    }
}
