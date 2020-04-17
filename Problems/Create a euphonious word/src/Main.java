import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCharacters = 1, result = 0;
        String value = scanner.nextLine();
        char[] mas = value.toCharArray();
        for (int i=0; i < mas.length; i++) {
            if (i < mas.length - 2) {
                countCharacters = 1;
                while (
                        (mas[i] != 'a' && mas[i] != 'e' && mas[i] != 'i' &&
                        mas[i] != 'o' && mas[i] != 'u' && mas[i] != 'y') &&
                        (mas[i+1] != 'a' && mas[i+1] != 'e' && mas[i+1] != 'i' &&
                        mas[i+1] != 'o' && mas[i+1] != 'u' && mas[i+1] != 'y')
                ) {
                    countCharacters++;
                    i++;
                    if (i >= mas.length-1) {
                        break;
                    }
                }
                if (countCharacters > 3 && countCharacters % 2 == 0 ) {
                    result += countCharacters / 2 - 1;
                } else if (countCharacters >= 3) {
                    result += countCharacters / 2;
                }
                countCharacters = 1;
                while (
                        (mas[i] == 'a' || mas[i] == 'e' || mas[i] == 'i' ||
                        mas[i] == 'o' || mas[i] == 'u' || mas[i] == 'y') &&
                        (mas[i+1] == 'a' || mas[i+1] == 'e' || mas[i+1] == 'i' ||
                        mas[i+1] == 'o' || mas[i+1] == 'u' || mas[i+1] == 'y')
                ) {
                    countCharacters++;
                    i++;
                    if (i >= mas.length-1) {
                        break;
                    }
                }


                if (countCharacters > 3 && countCharacters % 2 == 0 ) {
                    result += countCharacters / 2 - 1;
                } else if (countCharacters >= 3) {
                    result += countCharacters / 2;
                }
            }
        }
    System.out.print(result);
    }
}