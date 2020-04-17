import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value;
        int center;
        boolean result = true;
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        for (int i = 1; i < value.length(); i++) {
            if (value.charAt(i) != value.charAt(i-1)+1) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
