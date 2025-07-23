import java.util.Scanner;

public class strsum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First number: ");
        String strnum1=scan.nextLine();
        System.out.print("Enter Secound number: ");
        String strnum2=scan.nextLine();
        int intnum1=0;
        int intnum2=0;
        for(int i=0;i<strnum1.length();i++){
            intnum1=(intnum1*10)+strnum1.charAt(i)-'0';
        }
        for(int j=0;j<strnum2.length();j++){
            intnum2=(intnum2*10)+strnum2.charAt(j)-'0';
        }
        int ans=intnum1+intnum2;
        String strans="";
        while(ans>0){
            int rem=ans%10;
            strans=rem+strans;
            ans=ans/10;
        }
        System.out.println("Sum of String number is: "+strans);
    }
}
