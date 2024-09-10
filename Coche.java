public class Coche {
    String marca;
    String modelo;
    int year;

public Coche (String marca, String modelo, int year) {
    this.marca = marca;
    this.modelo = modelo;
    this.year = year;
    }

public void mostrarInformacion() {
    System.out.println("La marca es: " + marca);
    System.out.println("El modelo es: " + modelo);
    System.out.println("El año de salida es: " + year);
}

public void calcularEdadDelCoche() {
    System.out.println("La antiguedad del coche es de: " + (2024 - year) + " años");
}
}
