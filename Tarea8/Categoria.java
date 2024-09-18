import java.util.ArrayList;
import java.util.Random;

public class Categoria {

    public int id;
    public Random random= new Random();
    public String nombreCategoria;
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public Categoria(String nombreCategoria) {
        this.id = this.random.nextInt(1, 10001);
        this.nombreCategoria = nombreCategoria;
    }
    public void registrarProductoenCategoria(Producto producto) {
        this.listaProductos.add(producto);
    }
}
