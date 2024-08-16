package s01;

public class Task01 {
    public static void main(String[] args) {
        String str = new String("Привет! Мир!");

        System.out.println(lengthString(str));

    }

    public static int lengthString(String str) {
        return str.length();
    }
}
