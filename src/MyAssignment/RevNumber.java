package MyAssignment;

import java.util.Scanner;

public class RevNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int inputnum = sc.nextInt();

        int reversedNum = 0;

        while (inputnum != 0) {
            int digit = inputnum % 10;
            reversedNum = reversedNum * 10 + digit;
            inputnum = inputnum / 10;
        }

        System.out.println("Reversed Number: " + reversedNum);
    }
}
