import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5};
        int rotateNum = 3;
        Arrays.stream(rotLeft(list, rotateNum)).forEach(System.out::println);
    }

    static int[] rotLeft(int a[], int d) {
        int[] arr = new int[a.length];
        int length = a.length;
        if (d == length) {
            return a;
        }
        for (int i = 0; i < length; i++) {
            if (i + d < length) {
                arr[i] = a[i + d];
            } else {
                arr[i] = a[Math.abs(length - (i + d))];
            }
        }
        return arr;
    }

}
