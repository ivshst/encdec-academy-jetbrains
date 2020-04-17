import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int printNumber(BufferedReader reader) throws IOException {
        int number=0;
        String symbols="";
        try {
            symbols = reader.readLine();
            number = Integer.parseInt(symbols) * 10;
            if (number != 0) {
                System.out.println(number);
                return number;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid user input: " + symbols);
            return -1;
        }
        return number;
    }
    public static void main(String[] args) throws IOException {
        int number;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            number = printNumber(reader);
        } while(number != 0);
    }
}