package MyAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a positive number to find the factorial : ");
        num = sc.nextInt();
        if (num<=0){
            System.out.println("the number is invalid !! ");
        }else{
            long factorial =1;
            for(int i=1;i<=num;i++){
                factorial *= i;
            }
            System.out.println("factorial of "+num+" = "+factorial);
        }
    }
}


