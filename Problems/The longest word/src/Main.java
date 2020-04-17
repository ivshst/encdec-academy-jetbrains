import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String value, strMaxLength;
        String[] str;
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        str = value.split(" ");
        strMaxLength = str[0];
        for (int i = 1; i< str.length; i++) {
            if(str[i].length() > strMaxLength.length()) {
                strMaxLength = str[i];
            }
        }
        System.out.println(strMaxLength);
    }
}