import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if (input.equals("end") || input.equals("END")) {
                break;
            }
            String[] values = input.split(" ");

            try {
                String num1 = values[0];
                String num2 = values[2];
                String sim = values[1];

                if (isArabic.checkArabic(num1) && isArabic.checkArabic((num2))) {
                    System.out.println(isResult.res(isArabic.returnArabic(num1), isArabic.returnArabic(num2), sim));

                } else if ((isRoman.checkRoman(num1)) && (isRoman.checkRoman(num2))) {
                    System.out.println(isConvert.convert(isResult.res(isRoman.returnRoman(num1), isRoman.returnRoman(num2), sim)));

                } else {
                    System.out.println("");
                }

            } catch (Exception e) {
                System.out.println("error = " + e.getMessage());
            }
        }
    }
}
















