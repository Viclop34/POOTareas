public class PrecioInvalidoExcepcion extends Exception {
    public PrecioInvalidoExcepcion() {
        super("EL producto no tiene precio");
    }
    public PrecioInvalidoExcepcion(String mensaje) {
        super(mensaje);
    }
}
