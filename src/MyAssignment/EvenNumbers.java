package MyAssignment;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number (N) to find even numbers up to N:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Even numbers up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print (" "+i);
            }
        }
    }
}