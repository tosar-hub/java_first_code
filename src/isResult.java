public class isResult {

    public static int res(int a, int b, String s) {

        return switch (s) {
            case ("+") -> (a + b);
            case ("-") -> (a - b);
            case ("*") -> (a * b);
            case ("/") -> (a / b);
            default -> throw new IllegalStateException("Unexpected value: " + s);
        };
    }
}
