class Circle implements Shape {
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radio;
    }
}