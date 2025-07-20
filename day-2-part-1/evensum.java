import java.util.Scanner;
public class evensum {
    int evensums(int n){
        int totalsumofeven=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                totalsumofeven+=i;
            }
        }
        return totalsumofeven;
    }
    public static void main(String arge[]){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n=a.nextInt();
        evensum object=new evensum();
        int ans=object.evensums(n);
        System.out.println("--------------------------------");
        System.out.println("Total Even Number of Sum is: "+ans);
        System.out.println("--------------------------------");

        
    }
    
}
