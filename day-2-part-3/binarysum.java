import java.util.Scanner;
public class binarysum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First Binary number in String: ");
        String  a=scan.nextLine();
        System.out.print("Enter Secound Bianary Number in String: ");
        String b=scan.nextLine();
        int aanswer=0;
        int banswer=0;
        for(int i=0;i<a.length();i++){
            aanswer=(aanswer*2)+a.charAt(i)-'0';
        }
        for(int j=0;j<b.length();j++){
            banswer=(banswer*2)+b.charAt(j)-'0';
        }
        int ans=aanswer+banswer;
        System.out.println("Tow Binary Add in number: "+ans);
        String fanswer="";
        while(ans>0){
            int rem=ans%2;
            fanswer=rem+fanswer;
            ans=ans/2;
        }
        System.out.println("Tow Binary Add in String: "+fanswer);

    }
}
