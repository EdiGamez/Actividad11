import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione la figura: (1) Círculo, (2) Triángulo, (3) Cuadrado, (4) Salir");
            int tipoFigura = scanner.nextInt();

            if (tipoFigura == 4) {
                System.out.println("Saliendo del programa...");
                break;
            }

            Shape shape = null;
            switch (tipoFigura) {
                case 1:
                    System.out.println("Introduzca el radio del círculo:");
                    double radio = scanner.nextDouble();
                    shape = new Circle(radio);
                    break;
                case 2:
                    System.out.println("Introduzca los lados del triángulo (a, b, c):");
                    double ladoA = scanner.nextDouble();
                    double ladoB = scanner.nextDouble();
                    double ladoC = scanner.nextDouble();
                    System.out.println("Introduzca la altura del triángulo:");
                    double altura = scanner.nextDouble();
                    shape = new Triangle(ladoA, ladoB, ladoC, altura);
                    break;
                case 3:
                    System.out.println("Introduzca el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    shape = new Square(lado);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            System.out.println("Área: " + shape.getArea());
            System.out.println("Perímetro: " + shape.getPerimeter());
            System.out.println();
        }

        scanner.close();
    }
}