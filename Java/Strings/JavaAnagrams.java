
// Ali Rıza Altıparmak
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
            b = b.replaceFirst(Character.toString(a.charAt(i)), "");
        }
        return b.equals("");
    }
}
