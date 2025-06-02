package MyAssignment;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        double Sqrnum = 0;
        Math.sqrt(num);
        if (num <= 0) {
            System.out.println("The number " + num + " is negative or zero.");
        } else {
            double sqrt = Math.sqrt(num);
            if (sqrt == Math.floor(sqrt)) {
                System.out.println(num + " is a perfect square , since "+Sqrnum+" ");
            } else {
                System.out.println(num + " is not a perfect square!!");
            }
        }
        sc.close();
    }
}