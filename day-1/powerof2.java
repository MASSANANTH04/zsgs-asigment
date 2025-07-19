import java.util.Scanner;
public class powerof2 {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.print("enter Any number:");
        int n=a.nextInt();
        int number=n;
        while(n%2==0){
            n=n/2;
    
        }
        if(n==1){
            System.out.println(number+" is power of 2");
        }
        else{
            System.out.println(number+" is not power of 2");
        }
    }
}
