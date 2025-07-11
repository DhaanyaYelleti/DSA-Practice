public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0, n - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, n - 1, nums);
    }

    public static void reverse(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Sample input
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Print before rotation
        System.out.print("Original array: ");
        printArray(nums);

        // Rotate the array
        rotate(nums, k);

        // Print after rotation
        System.out.print("Rotated array: ");
        printArray(nums);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

