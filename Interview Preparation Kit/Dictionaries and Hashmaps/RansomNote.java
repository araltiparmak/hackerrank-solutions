import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ali Rıza Altıparmak
// github.com/araltiparmak
// hackerrank.com/araltiparmak

public class RansomNote {
    public static void main(String[] args) {
        String[] magazine = "give me one grand today night".split(" ");
        String[] note = "give one grand today".split(" ");
        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        List<String> list = new ArrayList<>(Arrays.asList(magazine));
        String untraceable = "Yes";
        for (String n : note) {
            if (list.contains(n)) {
                list.remove(n);
                continue;
            } else {
                untraceable = "No";
                break;
            }
        }
        System.out.println(untraceable);
    }
}
