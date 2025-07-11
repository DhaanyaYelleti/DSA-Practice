public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Sample input
        String input = "leetcode";

        // Call the method and print the result
        int index = firstUniqChar(input);
        System.out.println("First unique character is at index: " + index);
    }
}
