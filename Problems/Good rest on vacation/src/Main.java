import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        for(int i=0;i<4;i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(numbers[0]*numbers[1]+2*numbers[2]+(numbers[0]-1)*numbers[3]);
    }
}