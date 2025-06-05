package MyAssignment;

import java.util.Scanner;

public class GivePrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " is a Prime number");
            } else {
                System.out.println(i + " is NOT a Prime number");
            }
        }
    }
}