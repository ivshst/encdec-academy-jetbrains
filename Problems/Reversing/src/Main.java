import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.next();
        if (numberStr.length() == 4) {
            System.out.print(""+numberStr.charAt(0)+numberStr.charAt(3)+numberStr.charAt(2)+numberStr.charAt(1));
        }
        else {
            System.out.print(""+numberStr.charAt(2)+numberStr.charAt(1)+numberStr.charAt(0));
        }
    }
}