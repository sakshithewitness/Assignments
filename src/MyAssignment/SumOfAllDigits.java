package MyAssignment;

import java.util.Scanner;

public class SumOfAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Input : ");
            num = sc.nextInt();
        }
        while (num <= 0);
        int sum = 0;
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;

            System.out.println("Output : " + originalNum + " = " + sum);
        }
    }
}
