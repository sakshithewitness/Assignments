package MyAssignment;

// doubt !!!

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String S1 = cs.nextLine();
        System.out.println("Enter the Second string :");
        String S2 = cs.nextLine();

        if (S1.length() != S2.length()) {
            System.out.println("String cannot be Anagram because Lengths of the Strings re not even Equal!!! ");
        } else {
            char a1[] = S1.toCharArray();
            char a2[] = S2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

           if (Arrays.equals(a1, a2)) {
           // if(a1==a2){
                {
                    System.out.println("Congratualtions 7 crore!!! string is Anagram!!");
                } }else{
                    System.out.println("try again lol ");
                }
            }
        }
    }




