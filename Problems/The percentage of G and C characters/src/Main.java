import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        value = value.toLowerCase();
        for (int i=0; i<value.length(); i++) {
            if (value.charAt(i) == 'c' || value.charAt(i) == 'g') {
                ++count;
            }
        }
        System.out.println((double)count/value.length()*100);
    }
}
