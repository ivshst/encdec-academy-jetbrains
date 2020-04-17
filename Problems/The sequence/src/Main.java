import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max, value;
        max = 4;
        while(scanner.hasNext()) {
            value = scanner.nextInt();
            if(value % 4 == 0 && value > max) {
                max = value;
            }
        }
        System.out.print(max);
    }
}