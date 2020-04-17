import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        String symbols;
        int count = 1;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            symbols = reader.readLine().trim();
            if (symbols != null && !symbols.equals("")) {
                for (int i=0; i<symbols.length(); i++) {
                    if (symbols.charAt(i) == ' ') {
                        count++;
                        while (symbols.charAt(i) == ' ' && i < symbols.length()) {
                            i++;
                        }
                    }
                }
                System.out.print(count);
            } else {
                System.out.print(0);
            }
        }
    }
}