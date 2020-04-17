import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a, b, c, n, index=-1, max, countA=0, countB=0, countC=0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        n = scanner.nextInt();
        max = a;
        if (b > a) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        char[] password = new char[n];
        while (index < a + b + c - 1) {
            if (countA < a) {
                index++;
                countA++;
                password[index] = '\u0050';
                password[index]+=random.nextInt(9);
                if (index > 0) {
                    while (password[index] == password[index - 1]) {
                        password[index] = '\u0050';
                        password[index] += random.nextInt(9);
                    }
                }
                System.out.print(password[index]);
            }
            if (countB < b) {
                index++;
                countB++;
                password[index] = '\u0070';
                password[index]+=random.nextInt(9);
                if (index > 0) {
                    while (password[index] == password[index - 1]) {
                        password[index] = '\u0070';
                        password[index] += random.nextInt(9);
                    }
                }
                System.out.print(password[index]);
            }
            if (countC < c) {
                index++;
                countC++;
                password[index] = '\u0030';
                password[index]+=random.nextInt(9);
                if (index > 0) {
                    while (password[index] == password[index - 1]) {
                        password[index] = '\u0030';
                        password[index] += random.nextInt(9);
                    }
                }
                System.out.print(password[index]);
            }
        }
        while (index < n - 1) {
            index++;
            password[index] = '\u0030';
            password[index]+=random.nextInt(9);
            if (index > 0) {
                while (password[index] == password[index - 1]) {
                    password[index] = '\u0030';
                    password[index] += random.nextInt(9);
                }
            }
            System.out.print(password[index]);

            if (index < n - 1) {
                index++;
                password[index] = '\u0070';
                password[index]+=random.nextInt(9);
                if (index > 0) {
                    while (password[index] == password[index - 1]) {
                        password[index] = '\u0070';
                        password[index] += random.nextInt(9);
                    }
                }
                System.out.print(password[index]);
            }
            if (index < n - 1) {
                index++;
                password[index] = '\u0050';
                password[index]+=random.nextInt(9);
                if (index > 0) {
                    while (password[index] == password[index - 1]) {
                        password[index] = '\u0050';
                        password[index] += random.nextInt(9);
                    }
                }
                System.out.print(password[index]);
            }
        }
    }
}