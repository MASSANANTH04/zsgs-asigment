import java.util.Arrays;

public class cloe {
    public static void main(String[] args) {
        //deepcopy
        int array1[]={1,2,3,4,5,};
        int array2[]=array1.clone();
        array2[2]=1000;
        System.out.println("Deep copy");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        String str1[]={"Html","Css","Java Scrept","Java"};
        String str2[]=str1.clone();
        str2[2]="Poli";
        System.out.println("");
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        
    }
}
