import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double h = scanner.nextDouble();
         double a = scanner.nextDouble();
         double b = scanner.nextDouble();
         if((h-b)%(a-b)>0) {
             System.out.print((int)((h - b) / (a - b))+1);
         }else {
             System.out.print((int)((h - b) / (a - b)));
         }
    }
}