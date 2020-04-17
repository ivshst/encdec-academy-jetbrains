import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        int b;
        InputStream inputStream = System.in;
        while ((b = inputStream.read()) != -1) {
            System.out.print(b);
        }
        inputStream.close();
    }
}