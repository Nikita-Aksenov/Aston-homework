public class tz9 {
    public static void main(String[] args) {
        System.out.println(isleapYearOrnot(399));
    }

    public static boolean isleapYearOrnot(int i) {
        return (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0));
    }
}