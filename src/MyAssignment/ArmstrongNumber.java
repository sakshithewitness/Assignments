package MyAssignment;

import java.util.Random;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.print("Enter a positive number to find if the Sequence is armstrong : ");
        Scanner sc=new Scanner(System.in);
        int num;
        num = sc.nextInt();

        int temp=num;
        int res,sum=0;
        while( num>0){
            res=num%10;
            num=num/10;
            sum= sum+(res*res*res);
        }
        if(temp == sum){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}