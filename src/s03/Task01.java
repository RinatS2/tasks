package s03;

public class Task01 {
    public static void main(String[] args) {
        String str = new String("Привет мир!");

        System.out.println(reversString(str));
        System.out.println(reversStringWithChar(str));
    }

    public static String reversString(String str) {
        String[] strings = str.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        StringBuilder resultSB = new StringBuilder();

        for (String s : strings) {
            StringBuilder sb = new StringBuilder(s).reverse();
            resultSB.append(sb).append(" ");
        }

        return resultSB.toString().trim();
    }

    public static String reversStringWithChar(String str) {
        StringBuilder resultSB = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            resultSB.append(str.charAt(i));
        }

        return resultSB.toString();
    }
}
