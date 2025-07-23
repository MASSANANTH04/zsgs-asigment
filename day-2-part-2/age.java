import java.util.Arrays;
import java.util.Scanner;

public class age{
    int less18count=0;
    int age18_60=0;
    int age60=0;
    int less18(int pepolearray[]){
        for(int i=0;i<pepolearray.length;i++){
            if(pepolearray[i]<18){
                less18count++;
            }
            else continue;
        }
        return less18count;
}
int age18to60(int a[]){
    for(int i=0;i<a.length;i++){
        if(a[i]>=18 && a[i]<60){
            age18_60++;
        }
        else continue;
    }
    return age18_60;

}
int over60(int b[]){
    for(int i=0;i<b.length;i++){
        if(b[i]>=60){
            age60++;
        }
        else continue;
    }
    return age60;
}
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("How Many People age add: ");
        int pepolecount=scan.nextInt();
        int pepolearray[]=new int[pepolecount];
        for(int i=0;i<pepolecount;i++){
            System.out.print(i+1+" St pepole:");
            pepolearray[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(pepolearray));
        age obj=new age();
        int less18=obj.less18(pepolearray);
        System.out.println("People under 18: "+less18);
        int age18to60=obj.age18to60(pepolearray);
        System.out.println("Pepole age 18 -60: "+age18to60);
        int age60=obj.over60(pepolearray);
        System.out.println("Pepole over 60: "+age60);
        
    }
}