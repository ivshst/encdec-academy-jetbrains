import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=1, value;
        value = scanner.nextInt();
        while(n*n<=value) {
            System.out.println(n*n);
            n++;
        }
    }
}