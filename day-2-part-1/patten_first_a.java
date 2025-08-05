//question-2 (a
public class patten_first_a {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1)
                    System.out.print("1");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
