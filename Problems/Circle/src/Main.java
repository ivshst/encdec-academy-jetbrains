class Circle {

    double radius;

    double getLength() {
        return 2*Math.PI*this.radius;
    }
    double getArea() {
        return Math.PI*radius*radius;
    }
}