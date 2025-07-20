import java.util.Arrays;
import java.util.Scanner;


public class bitofnum {
    int setbit(int n){
        int count=0;
        while(n>0){
            count++;
            if(n%2!=0){
                return count;
            }
            n=n/2;
        }
        return 0;
    }
    public static void main(String arg[]){
        Scanner a=new Scanner(System.in);
        System.out.print("enter dec number:");
        int n=a.nextInt();
        bitofnum obj=new bitofnum();
        
        System.out.println(obj.setbit(n));

 

}
}
