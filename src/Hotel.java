import java.util.ArrayList;

public class Hotel {
    ArrayList<Habitacion> habitaciones = new ArrayList<>(5);
    private int maxHabitaciones = 5;

    public void registrarHabitacion(Habitacion hab) {
        if (habitaciones.size() < maxHabitaciones) {
            habitaciones.add(hab);
            System.out.println("HABITACION REGISTRADA");
        } else {
            System.out.println("Limite de habitaciones alcanzado");
        }
    }

    public void listarHabitaciones() {
        for (Habitacion hab : habitaciones) {
            System.out.println(hab.datosHabitacion());
        }
    }
    public boolean validarDisponibilidad(Habitacion hab) {
        if (hab.getDisponible()){
            return true;
        } else {
            return false;
        }
    }
    public double totalDeNoches(Habitacion hab, int noches) {
        double total = hab.precioPorNoche * noches;
        return total;
    }

    public void reserva(int numeroHabitacion, int noches) {
        for (Habitacion hab : habitaciones) {
            if (numeroHabitacion == hab.getNumeroHabitacion()) {
                if (validarDisponibilidad(hab)) {
                    hab.setDisponible(false);
                    System.out.println("HABITACION RESERVADA");
                    System.out.println("El precio total es: " + totalDeNoches(hab, noches));
                } else {
                    System.out.println("La habitación ya ha sido reservada con antelacion");
                }
            } else {
                System.out.println("Habitacion no encontrada");
            }
        }
    }

    public void liberarHabitacion(int numeroHabitacion) {
        for (Habitacion hab : habitaciones) {
            if (hab.getNumeroHabitacion() == numeroHabitacion) {
                if (validarDisponibilidad(hab)) {
                    System.out.println("La habitacion se ha liberado con antelacion");
                } else {
                    hab.setDisponible(true);
                    System.out.println("HABITACION LIBERADA");
                }
            } else {
                System.out.println("No se ha encontrado la habitacion");
            }
        }
    }
}



