import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] values = new String[3];
        for(int i = 0; i < 3; i++) {
            values[i] = scanner.next();
        }
        for(int i = values.length-1; i>=0; i--) {
            System.out.println(values[i]);
        }
    }
}