package MyAssignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter year:");
        Scanner sc=new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0) {
            System.out.println("its a leap year! ");
        }else {
            System.out.println("its not a leap year! ");
        }
    }
}
