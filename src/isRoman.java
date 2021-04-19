public class isRoman {

    public static String[] numbs = {"***", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static boolean checkRoman(String s) {
        boolean result = false;
        for (int i = 0; (i < numbs.length); i++) {
            if (numbs[i].equals(s)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int returnRoman(String s) {
        int index = -1;
        for (int i = 0; (i < numbs.length); i++) {
            if (numbs[i].equals(s)) {
                index = i;
                break;
            }
        }
        return index;
    }
}