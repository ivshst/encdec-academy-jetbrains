import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String newStr1 = str1.replace(" ", "");
        String newStr2 = str2.replace(" ", "");
        System.out.println(newStr1.equals(newStr2));
    }
}