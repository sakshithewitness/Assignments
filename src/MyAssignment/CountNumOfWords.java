package MyAssignment;

//Problem: Write a program to count the number of words in a given sentence.
//Input: "Logic building is fun" → Output: 4

import java.util.Scanner;

public class CountNumOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String :");
        String Sentence = sc.nextLine();
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < Sentence.length(); i++) {
            if (Sentence.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;}
                } else {
                    inWord = false;
                }
            }
            System.out.print("Number of Words:" + count);
            System.out.println("for the sentence:  " + Sentence);
        }
    }


