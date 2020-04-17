import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] times = new int[6];
        for(int i = 0; i < 6; i++) {
            times[i] = scanner.nextInt();
        }
        System.out.print((times[3]-times[0])*3600+(times[4]-times[1])*60+(times[5]-times[2]));
    }
}