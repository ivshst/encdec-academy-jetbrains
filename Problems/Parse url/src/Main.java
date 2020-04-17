import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String value,password = "";
        String[] mas,str;
        Scanner scan = new Scanner(System.in);
        value = scan.next();
        boolean isPass = false;
        mas = value.split("html\\?");
        mas = mas[1].split("&");
        for (int i = 0; i < mas.length; i++) {
            str = mas[i].split("=");
            System.out.print(str[0]);
            System.out.print(" : ");
            if (str[0].equals("pass")) {
                password = str[1];
                isPass = true;
            }
            if (str.length > 1) {
                System.out.println(str[1]);
            } else {
                System.out.println("not found");
            }
        }
        if (isPass) {
          System.out.println("password : "+password);
        }
    }
}
