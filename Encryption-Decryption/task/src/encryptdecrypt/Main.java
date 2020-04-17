package encryptdecrypt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static EncDecStrategy createSelectionAlg(String algorithm) {
        if (algorithm.equals("shift")) {
            return new EncDecStrategy(new AsciiStrategy());
        } else if (algorithm.equals("unicode")) {
            return new EncDecStrategy(new UnicodeStrategy());
        }
        return null;
    }

    public static void main(String[] args) {
        int key=0;
        String data="", mode="enc", inputPath="", outputPath="", algorithm = "shift";
        for (int i=0; i<args.length-1; i+=2) {
            if (args[i].equals("-mode")) {
                mode = args[i+1];
            }
            if (args[i].equals("-in")) {
                inputPath = args[i+1];
            }
            if (args[i].equals("-out")) {
                outputPath = args[i+1];
            }
            if (args[i].equals("-data")) {
                data = args[i+1];
            }
            if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i+1]);
            }
            if (args[i].equals("-alg")) {
                algorithm = args[i+1];
            }
        }
        EncDecStrategy strategy = createSelectionAlg(algorithm);

        if (inputPath.equals("")) {
            if (mode.equals("enc")) {
                System.out.print(strategy.encryption(data, key));
            } else if (mode.equals("dec")) {
                System.out.print(strategy.decryption(data, key));
            }
        } else {
            try {
                File file = new File(inputPath);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    data = scanner.nextLine();
                    if(outputPath.equals("")) {
                        if (mode.equals("enc")) {
                            System.out.print(strategy.encryption(data, key));
                        } else if (mode.equals("dec")) {
                            System.out.print(strategy.decryption(data, key));
                        }
                    } else {
                        File outFile = new File(outputPath);
                        FileWriter writer = new FileWriter(outFile);
                        if (mode.equals("enc")) {
                            writer.write(strategy.encryption(data, key));
                        } else if (mode.equals("dec")) {
                            writer.write(strategy.decryption(data, key));
                        }
                        writer.close();
                    }
                }
            }catch (FileNotFoundException e) {
                System.out.println("Error. FileNotFoundException");
            }catch (IOException e) {
                System.out.println("Error. IOException");
            }
        }
    }
}

class EncDecStrategy {

    private SelectionStrategy changeStrategy;

    public EncDecStrategy(SelectionStrategy changeStrategy) {
        this.changeStrategy = changeStrategy;
    }
    public String encryption(String originalText, int key) {
        return changeStrategy.encryption(originalText, key);
    }
    public String decryption(String originalText, int key) {
        return changeStrategy.decryption(originalText, key);
    }
}

interface SelectionStrategy {

    String encryption(String originalText, int key);
    String decryption(String originalText, int key);
}

class AsciiStrategy implements SelectionStrategy {

    @Override
    public String encryption(String originalText, int key) {
        String result;
        char[] cypherText = originalText.toCharArray();
        int originalAlphabetPosition, newAlphabetPosition;

        for (int i=0; i<cypherText.length; i++) {
            if ((int)cypherText[i] >= 97 && (int)cypherText[i] <= 122) {
                originalAlphabetPosition = cypherText[i] - 'a';
                newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                cypherText[i] = (char) ('a' + newAlphabetPosition);
            } else if ((int)cypherText[i] >= 65 && (int)cypherText[i] <= 90) {
                originalAlphabetPosition = cypherText[i] - 'A';
                newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                cypherText[i] = (char) ('A' + newAlphabetPosition);
            }
        }
        result = new String(cypherText);
        return result;
    }

    @Override
    public String decryption(String originalText, int key) {
        String result;
        char[] cypherText = originalText.toCharArray();
        int originalAlphabetPosition, newAlphabetPosition;

        key = 26 - (key % 26);
        for (int i=0; i<cypherText.length; i++) {
            if ((int)cypherText[i] >= 97 && (int)cypherText[i] <= 122) {
                originalAlphabetPosition = cypherText[i] - 'a';
                newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                cypherText[i] = (char) ('a' + newAlphabetPosition);
            } else if ((int)cypherText[i] >= 65 && (int)cypherText[i] <= 90) {
                originalAlphabetPosition = cypherText[i] - 'A';
                newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                cypherText[i] = (char) ('A' + newAlphabetPosition);
            }
        }
        result = new String(cypherText);
        return result;
    }
}

class UnicodeStrategy implements SelectionStrategy {

    @Override
    public String encryption(String originalText, int key) {
        String result;
        char[] cypherText = originalText.toCharArray();
        for (int i=0; i<cypherText.length; i++) {
            cypherText[i] += key;
        }
        result = new String(cypherText);
        return result;
    }

    @Override
    public String decryption(String originalText, int key) {
        String result;
        char[] cypherText = originalText.toCharArray();
        for (int i=0; i<cypherText.length; i++) {
            cypherText[i] -= key;
        }
        result = new String(cypherText);
        return result;
    }
}

