import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value;
        String[] str;
        int center;
        String result = "yes";
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        center = value.length() / 2;
        for (int i = 0; i< center; i++) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                result = "no";
            }
        }
        System.out.println(result);
    }
}