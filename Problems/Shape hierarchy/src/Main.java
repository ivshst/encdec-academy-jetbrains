abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    private double firstArg;
    private double secondArg;
    private double thirdArg;

    public Triangle(double firstArg, double secondArg, double thirdArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.thirdArg = thirdArg;
    }

    @Override
    double getPerimeter() {
        return firstArg + secondArg + thirdArg;
    }

    @Override
    double getArea() {
        return Math.sqrt(
                (firstArg + secondArg + thirdArg)/2*((firstArg + secondArg + thirdArg)/2 -
                firstArg)*((firstArg + secondArg + thirdArg)/2 -
                secondArg)*((firstArg + secondArg + thirdArg)/2 - thirdArg)
                );
    }
}

class Rectangle extends Shape {

   private double firstArg;
    private double secondArg;

    public Rectangle(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    @Override
    double getPerimeter() {
        return firstArg*2+secondArg*2;
    }

    @Override
    double getArea() {
        return firstArg*secondArg;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }
}
