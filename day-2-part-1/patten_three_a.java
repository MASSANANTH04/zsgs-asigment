//question 4-a
public class patten_three_a {
public static void main(String[] args) {
        int rows = 5;
        int i = 0;
        do {
            int space = 1;
            int j =0;
            do {
                if (space <= rows - i - 1) {
                    System.out.print(" ");
                    space++;
                }
            } while (space <= rows - i - 1);
            int num = 1;
            j = 0;
            do {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i < rows);
}
}