import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents1 = scanner.nextInt();
        int numberStudents2 = scanner.nextInt();
        int numberStudents3 = scanner.nextInt();
        int countDesks;
        countDesks = numberStudents1/2 + numberStudents1%2;
        countDesks += numberStudents2/2 + numberStudents2%2;
        countDesks += numberStudents3/2 + numberStudents3%2;
        System.out.print(countDesks);
    }
}