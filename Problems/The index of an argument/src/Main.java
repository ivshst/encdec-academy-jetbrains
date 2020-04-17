class Problem {

    public static int getIndex(String... array) {
        for (int i=0; i<array.length; i++) {
            if (array[i].equals("test")) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print(getIndex(args));
    }
}