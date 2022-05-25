package Java.BaekJoon;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        // 반복문을 사용하여 9단까지 N을 곱셈하도록 만든다.
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
