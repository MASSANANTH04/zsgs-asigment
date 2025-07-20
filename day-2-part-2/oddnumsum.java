import java.util.Scanner;
import java.util.Arrays;

public class oddnumsum {
    public static void main(String [] args){
     Scanner a=new Scanner(System.in);
     System.out.print("How Many Element in Array:");
     int n=a.nextInt();
     int array[]=new int[n];
     for(int i=0;i<n;i++){
        System.out.print("Enter "+i+1+"St Element:");
        array[i]=a.nextInt();
     }
     int count=0;
     for(int j:array){
        if(j%2==0)continue;
        count+=j;
     }
     System.out.println("************************************");
     System.out.println("Odd Number Total Sum= "+count);
     System.out.println("************************************");

    }
}
