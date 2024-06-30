public class Exception1 {
    public static void main(String[] args) {
        String[][] arr = { {"1", "2", "3", "4"},
                           {"5", "6", "7", "8"},
                           {"9", "10", "11", "12"},
                           {"13", "привет", "15", "16"}};
        try {
            summcheck(arr);
            System.out.println("Верный массив");
        } catch (Exception1.MyArrayDataException e) {
            System.out.println("Неверный массив: " + e.getMessage());
        }
    }

    public static void summcheck(String[][] arr) throws Exception1.MyArrayDataException {
        int[][] arr1 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    arr1[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new Exception1.MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr1[i][j];
            }
        }
    }

    private static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}

