package s02;

public class Task01 {
    public static void main(String[] args) {
        String strOne = new String("Привеjjт!");
        String strTwo = new String("Привет!");

        System.out.println(equalsStringsTrue(strOne, strTwo));
    }

    public static boolean equalsStrings(String strOne, String strTwo) {
        boolean b = false;
        if (strOne.equals(strTwo)) {
            b = true;
        }
        return b;
    }

    public static boolean equalsStringsTrue(String strOne, String strTwo) {
        return strOne.equals(strTwo);
    }
}
