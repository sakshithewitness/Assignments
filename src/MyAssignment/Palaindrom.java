package MyAssignment;

import java.util.Scanner;

public class Palaindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int original = sc.nextInt();
        int num = original;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrom Number");
        } else {
            System.out.println(original + " is NOT a Palindrom Number");
        }
    }
}