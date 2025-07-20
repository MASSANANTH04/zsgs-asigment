 import java.util.Scanner;
public class minume{
int minumenumber(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        return c;
    }
    public static void main(String [] args){
        Scanner num=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=num.nextInt();
        System.out.print("Enter Secound number: ");
        int b=num.nextInt();
        System.out.print("Enter third number: ");
        int c=num.nextInt();
        minume obj=new minume();
        int answer=obj.minumenumber(a, b, c);
        System.out.println("Minume number is: "+answer);

    }
}

