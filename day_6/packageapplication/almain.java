package day_6.packageapplication;
import java.util.Scanner;
import day_6.packageapplication.aritimatic.*;
import day_6.packageapplication.string.*;
public class almain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);
        aritimaticsum add=new aritimaticsum();
        stringmethod str=new stringmethod();
        int choice=0;
        int a;
        int b;
        String x;
        String y;
        
        do{
            System.out.println("1.Adison");
            System.out.println("2.Substration");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.String concatenation");
            System.out.println("6.String Reverse");
            System.out.println("7.Find String Length");
            System.out.println("8.EXIT");
            System.out.print("Enter Your Choice: ");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                System.out.print("First number: ");
                a=scan.nextInt();
                System.out.print("Secound number: ");
                b=scan.nextInt();
                add.add(a, b);
                break;
                 case 2:
                System.out.print("First number: ");
                a=scan.nextInt();
                System.out.print("Secound number: ");
                b=scan.nextInt();
                add.sub(a, b);
                break;
                 case 3:
                System.out.print("First number: ");
                a=scan.nextInt();
                System.out.print("Secound number: ");
                b=scan.nextInt();
                add.mul(a, b);
                break;
                 case 4:
                System.out.print("First number: ");
                a=scan.nextInt();
                System.out.print("Secound number: ");
                b=scan.nextInt();
                add.div(a, b);
                break;
                case 5:
                System.out.print("Enter first String : ");
                x=ss.nextLine();
                System.out.print("Enter Secound String : ");
                y=ss.nextLine();
                str.addtwostring(x,y);
                break;
                case 6:
                System.out.print("Enter name : ");
                x=ss.nextLine();
                str.streversestring(x);
                break;
                case 7:
                System.out.print("Enter String : ");
                x=ss.nextLine();
                str.findstringlengt(x);
                break;
                default:
                System.out.println("Worng Chouse");
            }


        }while(choice<8);
    }
}
