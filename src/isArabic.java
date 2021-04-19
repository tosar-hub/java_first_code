public class isArabic {

    public static String[] numbs = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static boolean checkArabic(String s) {
        boolean result = false;

        for (int i = 0; (i < numbs.length); i++) {
            if (numbs[i].equals(s)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int returnArabic(String s) {
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