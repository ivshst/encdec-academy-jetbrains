import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        String subValue = value.substring(left, right+1);
        System.out.println(subValue);
    }
}