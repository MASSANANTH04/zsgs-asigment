import java.util.Scanner;

public class stringextra {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter First String: ");
        String s1=a.nextLine();
        System.out.print("Enter Secound letter: ");
        String s2=a.nextLine();
        int ch[]=new int[26];
        for(int i=0;i<s1.length();i++){
            ch[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<s2.length();j++){
            ch[s2.charAt(j)-'a']--;
        }
        for(int q=0;q<ch.length;q++){
            if(ch[q]!=0){
                char ans=(char)(q+  'a');
                System.out.println("Value :"+ans);
            }
        }

        
    }
}
