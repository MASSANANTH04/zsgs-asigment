package day_8;

import java.util.Arrays;

//question -4
public class comentlineargument {
    public static void main(String[] args) {
        if(args.length==0   ){
            System.out.println("Your no argument passing...");
        }
        
        String[] array=new String[args.length];
        for(int i=0;i<args.length;i++){
            System.out.println("arquements"+ array[i]);
        }
   
    }
}
