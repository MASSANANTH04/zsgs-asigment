package day_6.employeedeatiles;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner scanstr=new Scanner(System.in);
        Scanner scanint=new Scanner(System.in);
        employsetget emp=new employsetget();
        System.out.print("Employee Id: ");
        int empid=scanint.nextInt();
        emp.setempid(empid);
        System.out.print("Employee Name: ");
        String empname=scanstr.nextLine();
        emp.setempname(empname);
        System.out.print("Employee designation:");
        String empde=scanstr.nextLine();
        emp.setdes(empde);
        System.out.print("Deportment: ");
        String empdep=scanstr.nextLine();
        emp.setdep(empdep);
        System.out.print("Salary per Month: ");
        double sal=scanint.nextDouble();
        emp.setsal(sal);
        

        System.out.println("Employee Deatles");
        System.out.println("******** *******");
        System.out.println();
        System.out.println("Employee ID:                                "+emp.getempid());
        System.out.println("Employee Name:                              "+emp.getempname());
        System.out.println("Employee designation:                       "+emp.getdes());
        System.out.println("Employee Deportment:                        "+emp.getdep());
        System.out.println("salary per Month:                           "+emp.getsal());
        System.out.println("Salary Per Year:                            "+emp.getsal()*12);

    }
}
