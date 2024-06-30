public class Exceptions {
    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        try {
            checkarr(arr);
            System.out.println("Верный размер массива");
        } catch (myArraySizeException e) {
            System.out.println("Неверный размер массива");
        }
    }

    public static void checkarr(String[][] arr) throws myArraySizeException  {
        if(arr.length != 4 || arr[0].length != 4) {
            throw new myArraySizeException();
        }
    }

    private static class myArraySizeException extends Exception {
    }
}
