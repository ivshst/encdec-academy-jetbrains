import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        return  number !=2 && number !=3 && number !=5 && number !=7 &&
                (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 ||
                number % 7 == 0);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}