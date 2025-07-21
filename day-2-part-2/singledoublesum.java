
import java.util.Scanner;
public class singledoublesum {
    int single=0;
    int doubledig=0;
    int single(int []array){
        for(int i=0;i<array.length;i++){
            if(array[i]<10){
                single=single+array[i];
            }
          
        }
          return single;
    }
    int doubledig(int array[]){
        for(int i=0;i<array.length;i++){
            if(array[i]>=10){
                doubledig+=array[i];
            }
        }
        return doubledig;
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter Limit Number in array: ");
        int n=a.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" St number: ");
            array[i]=a.nextInt();
        }
        singledoublesum obj=new singledoublesum();
       
       int single=obj.single(array);
       int doubledig=obj.doubledig(array);
       System.out.println("Single Did Sum: "+single);
       System.out.println("Double Dig Sum: "+doubledig);
    }
}
