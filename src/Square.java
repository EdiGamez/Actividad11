class Square implements Shape {
    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimeter() {
        return 4 * lado;
    }
}
