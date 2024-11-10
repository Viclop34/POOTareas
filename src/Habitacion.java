public class Habitacion {
    TipoDeHabitacion tipo;
    double precioPorNoche;
    boolean disponible;
    int numeroHabitacion;

    public Habitacion(TipoDeHabitacion tipo, double precioPorNoche, boolean disponible, int numeroHabitacion) {
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoDeHabitacion getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String disponibilidad(boolean disponible) {
        if (disponible) {
            return "Disponible";
        }
        else {
            return "No Disponible";
        }
    }

    public String datosHabitacion(){
        String datosHabitacion = String.format("Numero de Habitacion: %d       Tipo de hablitacion: %s     Precio por noche: %.2f      Disponibilidad: %s",numeroHabitacion, tipo,  precioPorNoche, disponibilidad(disponible));
        return datosHabitacion;
    }
}
