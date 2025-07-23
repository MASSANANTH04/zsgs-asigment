import java.util.Scanner;


public class captialword {
   static boolean word(String let){
    if(let.equals(let.toUpperCase()) || let.equals(let.toLowerCase())){
            return true;
        }
        String first=let.substring(0,1);
        String last=let.substring(1);
        if(first.equals(first.toUpperCase())  && last.equals(last.toLowerCase())){
            return true;
        }
        return false;
   }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Any Letter: ");
        String let=scan.nextLine();
        System.out.println("The Letter is True or False :"+word(let));

    }
}
