import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] continents = new String[7];
        for(int i = 0; i < 5; i++) {
            continents[i] = scanner.next();
        }
        scanner.nextLine();
        continents[5] = scanner.nextLine();
        continents[6] = scanner.nextLine();

        System.out.println(continents[2]);
        System.out.println(continents[0]);
        System.out.println(continents[5]);
        System.out.println(continents[6]);
        System.out.println(continents[1]);
        System.out.println(continents[4]);
        System.out.println(continents[3]);
    }
}