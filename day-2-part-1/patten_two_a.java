//question 3-a
public class patten_two_a {
     public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            int j = 1;
            while(j <= (i <= 3 ? i : 6 - i)) {
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
