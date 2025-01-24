package archive;// Problem: https://www.hackerrank.com/challenges/java-anagrams/problem

// @author Ali Rıza Altıparmak
// github.com/araltiparmak
// hackerrank.com/araltiparmak

public class JavaAnagrams {

    public static void main(String[] args) {
        System.out.println(isAnagram("act", "cat"));
    }

    static boolean isAnagram(String a, String b) {
        a = a.replaceAll(" ", "").toLowerCase();
        b = b.replaceAll(" ", "").toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (b.indexOf(c) == -1) {
                return false;
            }
            b = b.replaceFirst(String.valueOf(c), "");
        }
        return true;
    }
}
