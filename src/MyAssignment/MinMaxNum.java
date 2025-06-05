package MyAssignment;

public class MinMaxNum {
    public static void main(String[] args) {
        int arr[] = {32, 234, 43, 34, 7822, 2, 4, 1};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}