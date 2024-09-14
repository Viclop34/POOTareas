import java.util.Scanner;
public class MainRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el tamaño de la altura: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese el tamaño de las bases: ");
        double lado2 = scanner.nextDouble();

        Rectangulo rectangulo1 = new Rectangulo(lado1,lado2);

        rectangulo1.calcularArea(lado1, lado2);
        rectangulo1.calcularPerimetro(lado1, lado2);
    }
}