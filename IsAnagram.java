import java.util.HashMap;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> string1 = new HashMap<>();

        int n = s.length();
        int m = t.length();

        if (n != m) return false;

        for (int i = 0; i < n; i++) {
            char key = s.charAt(i);
            string1.put(key, string1.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            char tt = t.charAt(i);
            if (!string1.containsKey(tt)) return false;
            int current = string1.get(tt);
            if (current == 0) return false;
            string1.put(tt, current - 1);
        }

        for (Integer value : string1.values()) {
            if (value != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Sample inputs
        String s = "anagram";
        String t = "nagaram";

        // Call the function and print the result
        boolean result = isAnagram(s, t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + result);
    }
}
