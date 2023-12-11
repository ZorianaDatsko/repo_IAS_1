package thirdHomeWork;

public class Tree {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i <= rows; i = i + 2) {
            for (int j = 0; j <= rows - i - 1; j++) {
                System.out.print(" ");
            }
            int gap = 0;

            while (gap != 2 * i + 1) {
                System.out.print("*");
                gap++;
            }

            System.out.println();
        }
    }
}
