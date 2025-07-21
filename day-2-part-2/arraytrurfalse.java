import java.util.Arrays;
import java.util.Scanner;
public class arraytrurfalse {
    
    boolean chartrueorfalse(char[] a,char[] b){
    
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First Char Array Limit: ");
        int c1=scan.nextInt();
        char[] array1=new char[c1];
        for(int i=0;i<array1.length;i++){
            System.out.print("First char Array "+i+" st Value:");
            array1[i]=scan.next().charAt(0);
        }
        System.out.print("Enter Sceound Char Array Limite: ");
        int c2=scan.nextInt();
        char array2[]=new char[c2];
        for(int j=0;j<c2;j++){
            System.out.print("Secount Char Array "+j+" St Value:");
            array2[j]=scan.next().charAt(0);
        }
        arraytrurfalse obj=new arraytrurfalse();
        boolean ans=obj.chartrueorfalse(array1,array2);
        System.out.println("Char Array is Equal or Not EQual?: "+ans);
       
    }
}
