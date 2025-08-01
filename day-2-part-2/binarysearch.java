import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    int bsearch(int []sort,int target){
    int left=0;
   int right=sort.length-1;
   while(left<=right){
    int mid=(left+right)/2;
    if(sort[mid]<target){
        left=mid+1;
    }
    else if(sort[mid]>target){
        right=mid-1;
    }
    else{
        return mid;
    }
   }
   return -1    ;
    }
   public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.print("How Many number in add: ");
    int n=a.nextInt();
    int array[]=new int[n];
    for(int i=0;i<array.length;i++){
        System.out.print("Enter "+(i+1)+" st number in array:");
        array[i]=a.nextInt();
    }
    int[] sort =new int[n];
    for(int j=0;j<n;j++){
        sort[j]=array[j];
    }
    for(int o=0;o<sort.length;o++){
        for(int m=0;m<sort.length-1;m++){
            if(sort[m]>sort[m+1]){
                int temp=sort[m];
                sort[m]=sort[m+1];
                sort[m+1]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(sort));
                       //Binary Scarch

System.out.print("Enter target value:");
   int target=a.nextInt();
   binarysearch obj=new binarysearch();
   int midvalue=obj.bsearch(sort,target);
   System.out.println("Torget value find in array: "+midvalue);


   } 
}
