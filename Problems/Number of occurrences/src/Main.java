import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value, check;
        String[] str;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        check = scan.nextLine();
        str = value.split(check);
        for (int i=0; i<value.length(); i++) {
            i = value.indexOf(check,i);
            if (i == -1) {
                break;
            }
            i += check.length();
            ++count;
        }
        System.out.println(count);
    }
}
