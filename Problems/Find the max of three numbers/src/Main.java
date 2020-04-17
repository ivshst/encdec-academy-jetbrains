public static int getNumberOfMaxParam(int a, int b, int c) {
    if (a >= b && a >= c) {
        return 1;
        } else if (b >= a && b >= c)  {
        return 2;
        } else if (c >= b && c >= a) {
        return 3;
        }
    return -1;
}