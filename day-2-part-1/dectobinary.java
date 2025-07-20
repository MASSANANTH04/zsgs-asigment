import java.util.Scanner;
public class dectobinary {
    String binarystring="";       
    int decemal=0;
    int decmaltobinary(int n){
     
       while(n>0){    //n=18,n=9,n=4,n=2,n=1
        int rem=n%2;   //0  //1 //0  //0 //1
        binarystring=rem+binarystring;//0   //10  //010 //0010 //10010
        n=n/2;     //9  //4 //2 //1
       }
       for(int i=0;i<binarystring.length();i++){
        decemal=(decemal*10)+(binarystring.charAt(i)-'0');
       }
       return decemal;
       

    }
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter Any number:");
        int n=a.nextInt();
        dectobinary obj=new dectobinary();
        int answer=obj.decmaltobinary(n);
        System.out.println("Binary values: "+answer);



    }
    
}
