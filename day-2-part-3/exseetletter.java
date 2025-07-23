import java.util.Scanner;

public class exseetletter{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter Any number is: ");
        int num=a.nextInt();
        String ans="";
        while(num>0){
            num--;
            int rem=num%26;
            ans=(char)(rem+'A')+ans;
            num=num/26;
        }
        System.out.println(ans);
       
    }
}