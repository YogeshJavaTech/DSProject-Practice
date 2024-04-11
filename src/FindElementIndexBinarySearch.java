public class FindElementIndexBinarySearch {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int target = 7;

        int index = findElementIndex(input, target);
        if (index != -1)
            System.out.println("Element found at " + index);
        else
            System.out.println("Element not found");
    }

    private static int findElementIndex(int[] input, int target) {

        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (input[mid] == target)
                return mid;

            if (input[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }


        return -1;
    }
}
