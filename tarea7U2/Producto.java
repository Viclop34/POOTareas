import java.util.Scanner;
public class Producto {
    Scanner scanner = new Scanner(System.in);

    private String nombre;
    private double precio;
    private int stock;

public Producto (String nombre, double precio, int stock){
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
}

public void cambiarNombre (String nombre){
    String nuevoNombre;
    System.out.println("");
    System.out.println("A elegido la opcion de cambiar nombre");
    System.out.println("El nombre actual del producto es: "+ (getNombre()));
    System.out.println("Ingrese el nombre nuevo: ");
    nuevoNombre = scanner.nextLine();
    
    while (nuevoNombre.length() == 0 ){
        System.out.println("");
        System.out.println("El nombre no puede quedar vacio");
        System.out.println("Ingrese el nuevo nombre: ");
        nuevoNombre = scanner.nextLine();
    }
    setNombre(nuevoNombre);
    System.out.println("");
    System.out.println("El nuevo nombre es: " + (getNombre()));
}


public void aumentarSock(int Stock){
    int nuevoStock = 0;
    System.out.println("");
    System.out.println("A elegido la opcion de aumentar Stock");
    System.out.println("El stock actual es de: " + (getStock()));
    System.out.println("Ingrese la cantidad de stock nuevo: ");
    nuevoStock = scanner.nextInt();

    while (nuevoStock <= 0){
        System.out.println("");
        System.out.println("No se pueden ingresar numeros negativos... Cabeza po favo");
        System.out.println("Ingrese la cantidad de stock nuevo: ");
        nuevoStock = scanner.nextInt();
    }
    setStock(stock + nuevoStock);
    System.out.println("");
    System.out.println("La nueva cantidad de stock es de: " + (getStock()));

}


public void reducirSock(int Stock){
    int stockReucir = 0;
    int nuevoStock = 0;
    System.out.println("");
    System.out.println("A elegido la opcion de reducir Stock");
    System.out.println("El stock actual es de: " + (getStock()));
    System.out.println("Ingrese la cantidad de stock a retirar: ");
    stockReucir = scanner.nextInt();

    while (stockReucir >= 0){
        System.out.println("");
        System.out.println("No se pueden ingresar numeros positivos o 0... Piensele");
        System.out.println("Ingrese la cantidad de stock a retirar");
        stockReucir = scanner.nextInt();
    }

    nuevoStock = stock + stockReucir;

    while (nuevoStock < 0){
        System.out.println("");
        System.out.println("El stock no puede ser negativo");
        System.out.println("Ingrese una cantidad válida: ");
        stockReucir = scanner.nextInt();
        nuevoStock = stock + stockReucir;
    }
    setStock(nuevoStock);
    System.out.println("");
    System.out.println("La nueva cantidad de stock es de: " + (getStock()));

}


public void aumentarPrecio(double precio){
    double precioAumento = 0;
    System.out.println("");
    System.out.println("A elegido la opcion de aumentar precio");
    System.out.println("El precio actual del producto es: " + getPrecio());
    System.out.println("Ingrese el aumento de precio: ");
    precioAumento = scanner.nextDouble();

    while (precioAumento <= 0 ){
        System.out.println("");
        System.out.println("No puede dar un aumento de precio negativo");
        System.out.println("Ingrese el aumento de precio: ");
        precioAumento = scanner.nextDouble();
    }
    setPrecio(precio + precioAumento);
    System.out.println("");
    System.out.println("El precio actualizado del procucto es: " + (getPrecio()));
}

public void disminuirPrecio(double precio){
    double disminuirPrecio = 0;
    double nuevoPrecio = 0;
    System.out.println("");
    System.out.println("A elegido la opcion de disminuir precio");
    System.out.println("El precio actual del producto es: " + getPrecio());
    System.out.println("Ingrese la disminucion del precio: ");
    disminuirPrecio = scanner.nextDouble();

    while (disminuirPrecio > 0 ) {
        System.out.println("");
        System.out.println("Disminucion de precio positivo");
        System.out.println("Ingrese la disminucion del precio: ");
        disminuirPrecio = scanner.nextDouble();
        
    }

    nuevoPrecio = precio + disminuirPrecio;

    while (nuevoPrecio < 0){
        System.out.println("");
        System.out.println("El precio es negativo");
        System.out.println("Ingrese un precio valido:");
        disminuirPrecio = scanner.nextDouble();
        nuevoPrecio = precio + disminuirPrecio;
    }
    setPrecio(nuevoPrecio);
    System.out.println("");
    System.out.println("El nuevo precio es de: " + (getPrecio()));
}

public Producto (String nombre, double precio){
    this.nombre = nombre;
    this.precio = precio;
}

//Getters

public String getNombre (){
    return nombre;
}

public double getPrecio (){
    return precio;
}

public int getStock (){
    return stock;
}

// Setters
public void setNombre(String nombre){
    this.nombre = nombre;
}

public void setPrecio(double precio){
    this.precio = precio;
}

public void setStock(int stock){
    this.stock = stock;
}


}


