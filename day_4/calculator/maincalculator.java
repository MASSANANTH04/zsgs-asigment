package calculator;

import java.util.Scanner;

public class maincalculator {
    public static void main(String[] args) {
        addsubmuldiv add=new addsubmuldiv();
        advancecal adcal=new advancecal();
        sincos sc=new sincos();
        Scanner scan=new Scanner(System.in);
        int a=0;
        int b=0;
        double d=0;
        int allnum=0;
        
     
       
        
        do{
            System.out.println("Simple Calculation");
            System.out.println("------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtration ");
            System.out.println("3. Multipulication ");
            System.out.println("4.Division");
            System.out.println("5.Power");
            System.out.println("6.Modulo");
            System.out.println("7.Squarroot");
            System.out.println("8.Sin");
            System.out.println("9 Cos");
            System.out.println("10.Log");
            System.out.println("11.Exp");
            System.out.println("12.Exit");
            System.out.println();
            System.out.print("Enter your choice:");
             allnum=scan.nextInt();
            switch (allnum) {
                case 1:
                 System.out.print(" First Number: ");
                 a=scan.nextInt();
                 System.out.print(" Secound number: ");
                 b=scan.nextInt();
                    add.add(a, b);
                    break;
                case 2:
                System.out.print(" First Number: ");
                 a=scan.nextInt();
                 System.out.print(" Secound number: ");
                 b=scan.nextInt();
                    add.sub(a, b);
                    break;
                case 3:
                System.out.print(" First Number: ");
                 a=scan.nextInt();
                 System.out.print(" Secound number: ");
                 b=scan.nextInt();
                    add.mul(a,b);
                    break;
                case 4:
                System.out.print(" First Number: ");
                 a=scan.nextInt();
                 System.out.print(" Secound number: ");
                 b=scan.nextInt();
                    add.sub(a, b);
                    break;
                case 5:
                System.out.print("Enter Base value: ");
                int w=scan.nextInt();
                System.out.print("Enter Power Value: ");
                int q=scan.nextInt();
                    adcal.power(w,q);
                    break;
                    case 6:
                    System.out.print(" First Number: ");
                 a=scan.nextInt();
                 System.out.print(" Secound number: ");
                 b=scan.nextInt();
                 adcal.modulo(a, b);
                 case 7:
                 System.out.print(" First Number: ");
                 d=scan.nextDouble();
                 adcal.sqreroot(d);
                 break;
                 case 8:
                 System.out.print("Enter number:");
                 d=scan.nextDouble();
                 sc.sin(d);
                 break;
                  case 9:
                 System.out.print("Enter number:");
                 d=scan.nextDouble();
                 sc.cos(d);
                 break;
                  case 10:
                 System.out.print("Enter number:");
                 d=scan.nextDouble();
                 sc.log(d);
                 break;
                  case 11:
                 System.out.print("Enter number:");
                 d=scan.nextDouble();
                 sc.exp(d);
                 break;
                 
                 
                default:
                System.out.print("Invalide Sindax");
                    break;
            }
        }while(allnum<12);
    }
}
