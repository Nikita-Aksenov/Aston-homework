import java.util.Arrays;
import java.util.Scanner;

public class tz14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialValue = scanner.nextInt();
        int len = scanner.nextInt();
        int [] arr = Array(len, initialValue);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] Array(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;


    }
}
