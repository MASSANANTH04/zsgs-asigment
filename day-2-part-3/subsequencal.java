import java.util.Scanner;

public class subsequencal {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter first word: ");
        String first=a.nextLine();
        System.out.print("Enter Secound Word: ");
        String secound=a.nextLine();
        int i=0;
        int j=0;
        while(i<first.length() && j<secound.length()){
            if(first.charAt(i)==secound.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==first.length()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
