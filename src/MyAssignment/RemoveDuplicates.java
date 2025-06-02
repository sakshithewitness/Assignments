package MyAssignment;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5,6};
        int n = input.length;
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (input[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index] = input[i];
                index++;
            }
        }
        System.out.print("Output= [ ");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);

            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}