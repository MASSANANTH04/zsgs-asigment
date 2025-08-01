
//Question number -7

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("How may element add in array: ");
      int arraycount=scan.nextInt();
      int array[]=new int[arraycount];
      for(int arrayadd=0;arrayadd<arraycount;arrayadd++){
        System.out.print("Enter "+(arrayadd+1)+" st Element: ");
        array[arrayadd]=scan.nextInt();
      }
      System.out.println("Before Array: ");
      System.out.println(Arrays.toString(array));
      for(int i=0;i<array.length;i++){
        int min=array[i];
        int index=0;
        int intval=0;
        for(int j=i+1;j<array.length;j++){
            if(min>array[j]){
                min=array[j];
                index=j;
                intval=array[i];
            }
            array[index]=intval;
            array[i]=min;
        }
      }
      System.out.println("After sorted array ");
      System.out.println(Arrays.toString(array));
        
    }
}
