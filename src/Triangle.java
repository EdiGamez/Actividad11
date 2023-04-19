class Triangle implements Shape {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double altura;

    public Triangle(double ladoA, double ladoB, double ladoC, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
    }

    public double getArea() {
        return (ladoB * altura) / 2;
    }

    public double getPerimeter() {
        return ladoA + ladoB + ladoC;
    }
}