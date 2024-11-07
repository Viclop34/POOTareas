public class Producto {
    String nombre;
    Double precio;
    int cantidad;

    public Producto(String nombre, Double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        Double precioTotal = precio * cantidad;
        return precioTotal;
    }

    public String mostrarDetalles() {
        String datos = String.format("Nombre del producto: %s\nPrecio del producto: %.2f\nCantidad del producto: %d\nValor total: %.2f", nombre, precio, cantidad, calcularValorTotal());
        return datos;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}