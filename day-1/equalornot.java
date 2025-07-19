import java.util.Scanner;
public class equalornot {
    //first method without using comperation 
    void methodfirst(int num1,int num2){
        int chicknumber=num1^num2;
      switch(chicknumber){
        case 0:
        System.out.println(num1+" and " +num2+" is equal");
        break;
        default:
        System.out.println(num1+" and "+num2+" is not equal");
      }
      
      


    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=scan.nextInt();
        System.out.print("enter secound number:");
        int num2=scan.nextInt();
        equalornot obj=new equalornot();
        obj.methodfirst(num1, num2);
    }
}
