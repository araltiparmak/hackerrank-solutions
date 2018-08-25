import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Ali Rıza Altıparmak
// github.com/araltiparmak
// hackerrank.com/araltiparmak

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "aardvark";
        String s2 = "apple";
        System.out.println(twoStrings(s1, s2));
    }

    static String twoStrings(String s1, String s2) {
        String subStr = "NO";
        Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("")));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("")));
        Set<String> totalSet = new HashSet<>();
        totalSet.addAll(set1);
        totalSet.addAll(set2);
        if (totalSet.size() < set1.size() + set2.size()) {
            subStr = "YES";
        }
        return subStr;
    }
}
