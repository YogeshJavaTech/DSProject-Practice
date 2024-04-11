import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] input = {9, 4, 2, 6, 5, 1, 3, 8, 7};
        System.out.println("Given Array : " + Arrays.toString(input));
        convertToSortedArray(input);
        System.out.println("Sorted Array : " + Arrays.toString(input));
    }

    private static void convertToSortedArray(int[] input) {
        int temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }
}
