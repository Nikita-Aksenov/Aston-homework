import java.util.Arrays;

public class tz10 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0};
        for(int i = 0 ; i < 5; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }else if (arr[i] == 1) {
                arr[i] = 0;
            }

        } System.out.println(Arrays.toString(arr));
    }
}
