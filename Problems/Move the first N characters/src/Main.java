import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value;
        int count, length=1;
        char[] mas;
        char bufer;
        Scanner scan = new Scanner(System.in);
        value = scan.next();
        count = scan.nextInt();
        mas = value.toCharArray();
        if(count > value.length()) {
            System.out.print(value);
        } else {
            for (int i = 0; i < count; i++) {
                bufer = mas[0];
                for (int j = 0; j < mas.length - 1; j++) {
                    mas[j] = mas[j + 1];
                }
                mas[mas.length - 1] = bufer;
            }
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i]);
            }
        }
    }
}
