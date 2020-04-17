import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] values = new String[5];
        for(int i = 0; i < 5; i++) {
            values[i] = scanner.nextLine();
        }

        System.out.println("The form for Eugene is completed");
    }
}