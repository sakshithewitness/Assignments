package MyAssignment;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "hello";
        String reversedString = reverseString(inputString);
        System.out.println("Input: " + inputString);
        System.out.println("Output: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}