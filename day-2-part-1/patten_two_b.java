//question-3 (b
public class patten_two_b {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            int j = 1;
            while(j <= (i <= 3 ? i : 6 - i)) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
