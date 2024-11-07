public class ProductoInvalidoExcepcion extends Exception {
    public ProductoInvalidoExcepcion() {
        super("El nombre del producto esta vacio. Ingrese uno");
    }
    public ProductoInvalidoExcepcion(String mensaje) {
        super(mensaje);
    }
}
