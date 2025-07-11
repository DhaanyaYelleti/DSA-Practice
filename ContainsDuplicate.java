import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Sample input
        int[] nums = {1, 2, 3, 4, 1};

        // Call the function and print the result
        boolean result = containsDuplicate(nums);
        System.out.println("Contains duplicate? " + result);
    }
}
