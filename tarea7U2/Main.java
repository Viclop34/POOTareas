import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Producto producto1 = new Producto("Casio", 53400, 10);
        System.out.println("Bienvenido al editor de productos");
        System.out.println("Su producto actual es: " + (producto1.getNombre()));
        System.out.println("Con un precio de: " + (producto1.getPrecio()));
        System.out.println("Y cuenta con un stock de: " + (producto1.getStock()));

        System.out.println("");

        System.out.println("A continuacion se presentan las siguientes opciones: ");
        System.out.println("1-. CAMBIAR NOMBRE");
        System.out.println("2-. AUMENTAR STOCK");
        System.out.println("3-. DISMINUIR STOCK");
        System.out.println("4-. AUMENTAR PRECIO");
        System.out.println("5. DISMINUIR PRECIO");
        System.out.println("Elija la opcion deseada");
        opcion = scanner.nextInt();

        while (opcion < 1 || opcion > 5){
            System.out.println("Elija una opcion válida");
            System.out.println("1-. CAMBIAR NOMBRE");
            System.out.println("2-. AUMENTAR STOCK");
            System.out.println("3-. DISMINUIR STOCK");
            System.out.println("4-. AUMENTAR PRECIO");
            System.out.println("5. DISMINUIR PRECIO");
            System.out.println("Elija la opcion deseada");
            opcion = scanner.nextInt();
        }

        switch (opcion) {
            case 1:
            producto1.cambiarNombre(producto1.getNombre());
            return;

            case 2:
            producto1.aumentarSock(producto1.getStock());
            return;

            case 3:
            producto1.reducirSock(producto1.getStock());
            return;

            case 4:
            producto1.aumentarPrecio(producto1.getPrecio());
            return;

            case 5:
            producto1.disminuirPrecio(producto1.getPrecio());
        }
    }
}