import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {
    public ArrayList<Producto> listaProductos = new ArrayList();
    public static void main(String[] args) throws CantidadInvalidaExcepcion, PrecioInvalidoExcepcion, ProductoInvalidoExcepcion {
        Scanner sc = new Scanner(System.in);
        GestorInventario inventario = new GestorInventario();
        Producto producto1 = new Producto("Televisor",500.00,10);
        inventario.registrarProducto(producto1);


        int opcion = 0;

        while (opcion != 3){
            System.out.println("1. Crear producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                        sc.nextLine();
                        System.out.println("Ingresa el nombre del producto");
                        String nombre = sc.nextLine();
                        System.out.println("Ingresa el precio del producto");
                        double precio = sc.nextDouble();
                        System.out.println("Ingresa la cantidad del producto");
                        int cantidad = sc.nextInt();
                        Producto producto = new Producto(nombre, precio, cantidad);
                        inventario.registrarProducto(producto);
                    break;
                    case 2:
                        inventario.listarProductos();
                        break;
                        case 3:
                            return;
            }
        }
    }

    public void registrarProducto(Producto producto)throws ProductoInvalidoExcepcion, PrecioInvalidoExcepcion,CantidadInvalidaExcepcion {
        if (producto.getNombre().isEmpty()) {
            throw new ProductoInvalidoExcepcion();
        } else if (producto.getPrecio() <= 0) {
            throw new PrecioInvalidoExcepcion();
        } else if (producto.getCantidad() <= 0) {
            throw new CantidadInvalidaExcepcion();
        } else {
            listaProductos.add(producto);
        }
    }
    public void listarProductos(){
        for(Producto producto: listaProductos){
            System.out.println(producto.mostrarDetalles());
        }
    }

}
