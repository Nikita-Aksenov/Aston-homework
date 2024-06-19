public class tz2 {
    public static void main(String[] args) {
        checkSumSign(0, -4);
    }

    public static void checkSumSign(int a, int b) {
        int summ = a + b;
        if (summ >= 0) {
            System.out.println("Сумма положительная");
        } else if (summ < 0) {
            System.out.println("Сумма отрицательная");
        }

    }
}
