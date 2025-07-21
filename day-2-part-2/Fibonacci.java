import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=e.nextInt();
        int a=0;
        int b=1;
        System.out.print("Fibonacci:"+a+","+b+",");
        for(int i=1;i<=n-2;i++){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;

        }

    }

}
