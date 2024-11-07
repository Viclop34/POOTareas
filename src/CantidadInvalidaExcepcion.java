public class CantidadInvalidaExcepcion extends Exception {
    public CantidadInvalidaExcepcion() {
        super("No hay cantidad de producto");
    }
    public CantidadInvalidaExcepcion(String mensaje) {
        super(mensaje);
    }
}
