/**
 * It returns a double value or 0 if an exception occurred
 */
public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (Throwable e) {
            return 0;
        }
}