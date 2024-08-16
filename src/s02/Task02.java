package s02;

public class Task02 {
    public static void main(String[] args) {
        String strOne = new String("Привет!");
        String strTwo = new String("Привет!");

        System.out.println(equalsStrings(strOne, strTwo));
    }

    public static boolean equalsStrings(String strOne, String strTwo) {
        boolean b = false;
        if (strOne.equals(strTwo)) {
            b = true;
        }
        return b;
    }
}
