import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String value;
        String[] str;
        int center, leftAmount = 0, rightAmount = 0;
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        center = value.length() / 2;
        for (int i = 0; i< value.length(); i++) {
            if (i < center) {
                leftAmount += (int)value.charAt(i);
            } else {
                rightAmount += (int)value.charAt(i);
            }
        }
        if(leftAmount == rightAmount) {
            System.out.print("Lucky");
        } else {
            System.out.print("Regular");
        }
    }
}