public class isConvert {
    public static String[] numbs1 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static String[] numbs2 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static String convert(int num) {
        String str = Integer.toString(num);
        String s1 = "";
        String s2 = "";

        if (num == 100) {
            return "C";
        } else if (num == 10) {
            return "X";
        } else if (num < 10) {
            return numbs2[num];
        } else if (num != 0) {

            char a = str.charAt(0);
            char b = str.charAt(1);

            String one = Character.toString(a);
            String two = Character.toString(b);

            s1 = numbs1[Integer.parseInt(one)];
            s2 = numbs2[Integer.parseInt(two)];

            return s1 + s2;
        }
        return "";

    }
}
