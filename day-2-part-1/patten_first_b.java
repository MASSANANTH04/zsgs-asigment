//question- 2 (b
public class patten_first_b {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || i == 2) && j < 4) {
                    System.out.print("R ");
                }
                else if (i == 1 && (j == 0 || j == 3)) {
                    System.out.print("R ");
                }
                else if (i == 3 && (j == 0 || j == 2)) {
                    System.out.print("R ");
                }
                else if (i == 4 && (j == 0 || j == 3)) {
                    System.out.print("R ");
                }
                else {
                    System.out.print("  "); // space
                }
            }
            System.out.println();
        }
    }

}
