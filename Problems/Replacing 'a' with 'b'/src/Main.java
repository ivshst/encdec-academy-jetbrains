import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String newValue = value.replace("a","b");
        System.out.println(newValue);
    }
}