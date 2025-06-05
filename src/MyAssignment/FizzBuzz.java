package MyAssignment;
public class FizzBuzz {
    public static void main(String[] args) {

        int num;
        for (num = 1; num <= 15; num++) {
            if (num % 3 == 0) {
                System.out.print(" Fizz");
            } else if (num % 5 == 0) {
                System.out.print(" Buzz");
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.print(" FizzBuzz ");
            }
            System.out.print(" "+ num );
        }

    }
}
