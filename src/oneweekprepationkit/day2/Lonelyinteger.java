package oneweekprepationkit.day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lonelyinteger {

  public  static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4, 3, 2, 1);
        System.out.println(lonelyInteger(a));
    }

    public static int lonelyInteger(List<Integer> a) {

        Set<Integer> set = new HashSet<>();

        for (Integer number : a) {
            if (!set.add(number)) {
                set.remove(number);
            }
        }

        return set.iterator().next();
    }
}
