package string;

import java.util.Scanner;

public class stringmain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scanstr=new Scanner(System.in);
        findans str=new findans();
        int choice=0;
        String  name="",name2="";
        int index=0,start=0,end=0,time=1;
        char c='o',old='o',neww='o';

        do{
            System.out.println();
            System.out.println("**************************************************************");
            System.out.println("                              STRING TABLE");
            System.out.println("                                                                             "+time+" 'st Times Run");
            System.out.println();
            System.out.println("1.Find String length");
            System.out.println("2.index to Character");
            System.out.println("3.Chick String Equal or Not");
            System.out.println("4.UpperCase:");
            System.out.println("5.LowerCase");
            System.out.println("6.SubString");
            System.out.println("7.String concat");
            System.out.println("8.String Contains");
            System.out.println("9.char to index");
            System.out.println("10.String Replace");
            System.out.println("11.Exit");
            System.out.println("**************************************************************");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            time++;
             choice=scan.nextInt();
             System.out.println();
            switch(choice){
                case 1:
                System.out.print("Enter String:");
                name=scanstr.nextLine();
                System.out.println();
                str.strlength(name);
                System.out.println("-----------------------");
                break;
            
            case 2:
            System.out.print("Enter String: ");
            name=scanstr.nextLine();
            System.out.print("Enter Insert number:");
            index=scan.nextInt();
            System.out.println();
            str.strintdex(name, index);
            System.out.println("-----------------------");
            break;

            case 3:
            System.out.print("Enter First String:");
            name=scanstr.nextLine();
            System.out.print("Enter Secound String:");
            name2=scanstr.nextLine();
            System.out.println();
            str.strequalornat(name, name2);
            System.out.println("-----------------------");
            break;

            case 4:
            System.out.print("Enter String: ");
            name=scanstr.nextLine();
            System.out.println();
            str.struppercase(name);
            System.out.println("-----------------------");
            break;
            
            case 5:
             System.out.print("Enter String: ");
            name=scanstr.nextLine();
            System.out.println();
            str.strlowercase(name);
            System.out.println("-----------------------");
            break;
            case 6:
            System.out.print("Enter String:");
            name=scanstr.nextLine();
            System.out.print("Start value in index: ");
            start=scan.nextInt();
            System.out.print("Start value in index: ");
            end=scan.nextInt();
            System.out.println();
            str.strsubstring(name, start, end);
            System.out.println("-----------------------");
            break;

            case 7:
            System.out.print("Enter 1'st String:");
            name=scanstr.nextLine();
            System.out.print("Enter 2'st String:");
            name2=scanstr.nextLine();
            System.out.println();
            str.strconcat(name, name2);
            System.out.println("-----------------------");
            
            case 8:
            System.out.print("Enter String: ");
            name=scanstr.nextLine();
            System.out.print("Enter sustring: ");
            name2=scanstr.nextLine();
            System.out.println();
            str.strcontains(name, name2);
            System.out.println("-----------------------");

            case 9:
            System.out.print("Enter String: ");
            name=scanstr.nextLine();
            System.out.print("Enter chracter: ");
            c=scanstr.nextLine().charAt(0);
            System.out.println();
            str.strcharreturnindex(name, c);
            System.out.println("-----------------------");
            break;
            
            case 10:
            System.out.print("Enter String: ");
            name=scanstr.nextLine();
            System.out.print("Enter old Char: ");
            old=scanstr.nextLine().charAt(0);
            System.out.print("Enter add new Char: ");
            neww=scanstr.nextLine().charAt(0);
            System.out.println();
            str.strreplace(name, old, neww);
            System.out.println("-----------------------");
            break;
            default:
            System.out.println("                                                                                 Thank You!!!");
            System.out.println("                                                                                 ^^^^^^^^^^^^");
            break;

            }
        }while(choice<112);
    }
}
