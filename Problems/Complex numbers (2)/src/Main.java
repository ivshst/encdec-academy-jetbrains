class Complex {

    double real;
    double image;

    void add(Complex compl) {
        this.real += compl.real;
        this.image += compl.image;
    }
    void subtract(Complex compl) {
        this.real -= compl.real;
        this.image -= compl.image;
    }
}