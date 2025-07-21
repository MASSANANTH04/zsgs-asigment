import java.util.Scanner;
public class praimnum {
    public static void main(String[] args) {
        System.out.print("Enter Any number: ");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int count=0;
        String prame="";
        for(int i=2;i<=number;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
                
            }
            if(count==2){
                prame+=i+" ,";
            }
        }
        System.out.println(prame);
    
        
    }
}
