class Problem {

    public static void calculator(String... array) {
        if (array[0].equals("+")) {
            System.out.print(Integer.parseInt(array[1]) + Integer.parseInt(array[2]));
        } else if (array[0].equals("-")) {
            System.out.print(Integer.parseInt(array[1]) - Integer.parseInt(array[2]));
        } else if (array[0].equals("*")) {
            System.out.print(Integer.parseInt(array[1]) * Integer.parseInt(array[2]));
        } else {
            System.out.print("Unknown operator");
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        calculator(args);
    }
}