import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class studentsubject {  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter How Many Student: ");
        int scountt=scan.nextInt();
        System.out.println("----------------------");
        System.out.print("How Many Subject add: ");
        int ssub=scan.nextInt();
         System.out.println("----------------------");
        int rollandsub[][]=new int[scountt][ssub];
        int total[]=new int[scountt];
        double average[]=new double[scountt];
        int rollno[]=new int[scountt];
        for(int i=0;i<scountt;i++){
            System.out.println("");
            System.out.println(i+1+" St Student ");
            System.out.println("***************");
            System.out.print("Roll Number: ");
            rollno[i]=scan.nextInt();
            for(int j=0;j<ssub;j++){

                System.out.print((j+1)+" Subject Mark:");
                rollandsub[i][j]=scan.nextInt();
                total[i]+=rollandsub[i][j];
            }
            average[i]=(double)total[i]/ssub;
        }
        
        for(int x=0;x<scountt;x++){
            System.out.println(x+1+" St Student Result");
            System.out.println("********************");
           
           System.out.print("Rollno:  "+rollno[x]+"            Average :"+average[x]+"             Total Mark: "+total[x]);
           System.out.println();
        }
    }   
}
