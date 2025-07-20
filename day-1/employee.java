import java.util.Scanner;
public class employee {
     employee(int empid,String name,String deportmant, int salary){
        System.out.print("Employee id: \temployee name: \tteam name: \tsalary:");
        System.out.println("\n"+empid+"\t\t"+name+"\t\t"+deportmant+"\t\t"+salary);
        
    }
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        System.out.print("enter your emp id: ");
        int employeeid=a.nextInt();
        System.out.print("enter your name: ");
        String empname=b.nextLine();
        System.out.print("Your team is:");
        String dep=b.nextLine();
        System.out.print("my salary is:");
        int sal=a.nextInt();
        System.out.println("---------------------------------------------------------");

        employee object=new employee(employeeid,empname,dep,sal);
        System.out.println("----------------------------------------------------------");

    }
    
}
