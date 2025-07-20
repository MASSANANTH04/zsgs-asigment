import java.util.Scanner;
class markdisplay{
    totalclass obj=new totalclass();
    void mark(short a,short b,short c,short d,short e){
        System.out.println("********************");
        System.out.println("Tamil - "+a);
        System.out.println("English - "+b);
        System.out.println("Maths - "+c);
        System.out.println("Science - "+d);
        System.out.println("Social Science - "+e);

    }
}
class totalclass{
    int total(short m1,short m2,short m3,short m4,short m5){
        return (int)m1+m2+m3+m4+m5;
    }
}
public class student {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter Tamil mark: ");
        short tamil=a.nextShort();
        System.out.print("Enter English mark:");
        short english=a.nextShort();
        System.out.print("Enter Math Mark: ");
        Short maths=a.nextShort();
        System.out.print("Enter Science mark: ");
        short science=a.nextShort();
        System.out.print("Social Science Mark: ");
        short scscience=a.nextShort();
        System.out.println("-------------------------------------------------------------------");
        markdisplay obj1=new markdisplay();
        totalclass obj2=new totalclass();
       
        obj1.mark(tamil,english,maths,science,scscience);
       int total= obj2.total(scscience, tamil, english, science, scscience);
        int average=total/5;
        System.out.println("********************");
        System.out.println("total="+total);
        System.out.println("Average="+average);

        //if statement use find gread
         System.out.println("********************************************");
        if(average>=85 &&average<=100){
            System.out.println("Your Gread is A");
        }
        else if(average>=70 && average<85){
            System.out.println("Your Gread is B");
        }
        else if(average>=50 && average<70){
            System.out.println("Your Gread is C");
        }
        else System.out.println("Fail....");
        System.out.println("********************************************");



        //Using switch
        average= average/10;
        switch(average){
            case 10:
            System.out.println("Your Gread is A");
            break;
            case 9:
            System.out.println("Your Gread is A");
            break;
            case 8:
            System.out.println("Your Gread is A");
            break;
            case 7:
            System.out.println("Your Gread is B");
            break;
            case 6:
            System.out.println("Your Gread is B");
            break;
            case 5:
            System.out.println("Your Gread is B");
            break;
            default:
            System.out.println("FAILL.............");
        }
}
}
