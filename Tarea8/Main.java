import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar Categorias");
            System.out.println("5. Mostrar categorias con productos");
            System.out.println("6. Registrar Categoria");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if(!inventario.validarExistenciadeCategorias()){
                        System.out.println("No existen categorias en el sistema");
                        break;
                    }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el id de la categoría en la cual " +
                            "registraras el producto");
                    int idcategoria = scanner.nextInt();

                    scanner.nextLine();

                    if (!inventario.validarExistenciadeCategoria(idcategoria)) {
                        System.out.println("No existe la categoria ingresada. Intente de nuevo.");
                        break;
                    }

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, idcategoria, stock);
                    inventario.registrarProducto(producto);
                    inventario.registrarProductoEnCategoria(idcategoria, producto);

                    System.out.println("\nProducto registrado correctamente");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                break;
                case 4:
                    //crear un metodo para listaar todas las categorias del sistema
                    inventario.mostrarCategorias();
                    break;
                case 5:
                    //crear un metodo para listaar todas las categorias del sistema junto con sus productos
                    inventario.mostrarCategoriasConProductos();
                    break;
                case 6:
                    System.out.println("Seleccionaste la opcion para agregar una categoria");
                    System.out.println("Ingresa el nombre de la categoria: ");
                        String nombreCategoria= scanner.nextLine();

                        Categoria categoria = new Categoria(nombreCategoria);
                        inventario.registrarCategoria(categoria);
                    System.out.println("\nCategoria registrado correctamente");
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}