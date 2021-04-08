package prime;

import java.util.Scanner;


class prime {

    static Scanner scan = new Scanner(System.in);
    static long a01 = 0L;

    public static void main(String[] args) {
        toDeciamal(scan.nextInt(),scan.nextInt());
    }


    private static void toDeciamal(int num, int base){
        // I didn't add any validaiotn here
        startTime();
        int rem = 0 , temp = 0;
        double result = 0;
        while (num > 0) {
            rem  = num % 10;
            num = num /10;
            result  = result + (Math.pow(base,temp) * rem);
            temp += 1;
        }
        System.out.println((int)result);
        endTime();
    }

    private static String pythagoreanTriangle(int num1, int num2, int num3) {
        // a^2 = b^2 + c^2
        // System.out.println(pythagoreanTriangle(scan.nextInt(), scan.nextInt(), scan.nextInt()));

        if(num1 == num2 || num2 == num3 || num1 == num3){
            return "not a Pythagorean triangle as values are equal";
        }

        startTime();
        int a, b, c;
        String result = "";

        a = Integer.max(num1, Integer.max(num2, num3));

        if (a == num1) {
            b = num2;
            c = num3;
        } else if (a == num2) {
            b = num1;
            c = num3;
        } else {
            b = num1;
            c = num2;
        }

        if (a * a == b * b + c * c) {
            result = "Pythagorean triangle";
        } else {
            result = "not a Pythagorean triangle";
        }
        endTime();
        return result;
    }

    // i like this one based on nCr video no: 6.2 in c++ by apna college
    private static void pascalTriangle(int row) {
        startTime();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(i - j) * factorial(j)));
            }
            System.out.println();
        }
        endTime();
    }

    private static int factorial(int num) {

        // for nCr testing here
        // System.out.println(factorial(n)/(factorial(n-r) * factorial(r)));

        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;

    }

    private static void prime() {

        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            int j;
            for (j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i / 2) {
                System.out.println(i);
            }
        }

    }


    private static void startTime() {
        a01 = System.currentTimeMillis();
    }

    private static void endTime() {
        System.out.println("time taken by fun(): "+(System.currentTimeMillis()  - a01)+"ms");
    }

}
