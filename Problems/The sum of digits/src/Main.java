import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summa = n%10;
        n = n/10;
        summa += n%10;
        n = n/10;
        summa += n;
        System.out.print(summa);
    }
}