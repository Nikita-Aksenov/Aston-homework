public class tz5 {
    public static void main(String[] args) {
        System.out.println(SumRange(1, 5));
    }
    public static boolean SumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;

    }
}
