/* Please, do not rename it */
class Problem {

    public static int getMax(String... array) {
        int max = Integer.parseInt(array[1]);
        for (int i=2; i<array.length; i++) {
            if (Integer.parseInt(array[i]) > max) {
                max = Integer.parseInt(array[i]);
            }
        }
        return max;
    }
    public static int getMin(String... array) {
        int min = Integer.parseInt(array[1]);
        for (int i=2; i<array.length; i++) {
            if (Integer.parseInt(array[i]) < min) {
                min = Integer.parseInt(array[i]);
            }
        }
        return min;
    }
    public static int getAmount(String... array) {
        int amount = Integer.parseInt(array[1]);
        for (int i=2; i<array.length; i++) {
            amount += Integer.parseInt(array[i]);
        }
        return amount;
    }

    public static void main(String args[]) {
        String operator = args[0];
        if (operator.equals("MAX")) {
            System.out.print(getMax(args));
        } else if (operator.equals("MIN")) {
            System.out.print(getMin(args));
        } else if (operator.equals("SUM")) {
            System.out.print(getAmount(args));
        }

    }
}