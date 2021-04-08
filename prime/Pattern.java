package prime;

import java.util.Scanner;

public class Pattern {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }   System.out.println();

        }
    }

    public static void doubleSidePattern() {
        int row = scan.nextInt();
        for (int i = 1; i <= row; i++) {
            int space = 2 * row - 2 * i;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            int space = 2 * row - 2 * i;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfTriangleWithSpace() {
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j <= row - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    public static void hollowRactangle() {
        // look like O in watch
        int row = scan.nextInt();
        int column = scan.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == 0 || j == column - 1 || i == 0 || i == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
