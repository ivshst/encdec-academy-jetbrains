import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value, subStr;
        int count = 0, length=1;
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        for (int i=0; i<value.length(); i++) {
            length = 1;
            if (i == value.length()-1) {
                System.out.print(""+value.charAt(i)+length);
                break;
            }
            if (value.charAt(i) == value.charAt(i+1)) {
                do {
                    ++length;
                    if (i + length >= value.length()) {
                        break;
                    }
                } while (value.charAt(i) == value.charAt(i + length));
                subStr = value.substring(i, i + length);
                System.out.print(""+subStr.charAt(0)+length);
                i+= length-1;
            } else {
                System.out.print(""+value.charAt(i)+length);
            }
        }
    }
}
