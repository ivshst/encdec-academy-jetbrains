class Cat {

    private static int counter=0;
    private int age;
    private String name;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        counter += 1;
    }

    public static int getNumberOfCats() {
        if (counter > 5) {
            System.out.println("You have too many cats");
            return counter;
        }
        return counter;
    }
}