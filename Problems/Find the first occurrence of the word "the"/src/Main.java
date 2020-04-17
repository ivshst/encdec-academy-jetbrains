import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value, check = "the";
        boolean result = true;
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        System.out.println(value.toLowerCase().indexOf(check));
    }
}
