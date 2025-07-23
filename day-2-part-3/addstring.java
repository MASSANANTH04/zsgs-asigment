import java.util.Scanner;

public class addstring {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("First String number: ");
        String num1=scan.nextLine();
        System.out.print("Secound String number: ");
        String num2=scan.nextLine();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        String ans="";
        while(i>=0 || j>=0 || c>0){
            int a=0;
            int b=0;
            if(i>=0){
                a=(num1.charAt(i)-'0');
                i--;
            }
            if(j>=0){
                b=(num2.charAt(j)-'0');
                j--;
            }
            int sum=a+b+c;
            int rem=sum%10;
            ans=rem+ans;
            c=sum/10;

        }
      System.out.println("Tow Number add sum: "+ans);


    
    }
}
