import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        String symbols;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            symbols = reader.readLine();
            for (int i=symbols.length()-1; i>=0; i--) {
               System.out.print(symbols.charAt(i));
            }
        }
    }
}