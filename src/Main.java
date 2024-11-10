import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NochesInvalidas{
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Elija la opcion deseada");
            System.out.println("1. Registrar habitacion");
            System.out.println("2. Reservar habitacion");
            System.out.println("3. Liberar habitacion");
            System.out.println("4. Salir");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Se ingreso algo diferente a un numero");
                sc.nextLine();
            }

            switch (opcion) {
                case 1:
                System.out.println("REGISTRAR HABITACION");
                System.out.println("Ingrese el tipo de habitacion:");
                System.out.println("1.Individual");
                System.out.println("2.Doble");
                System.out.println("3.Suite");
                System.out.println("Los precios x noche seran los siguientes:");
                System.out.println("Individual: $50     Doble: $75      Suite: $100");
                int otipo = sc.nextInt();
                while (otipo < 1 || otipo > 3) {
                    System.out.println("Ingrese el tipo de habitacion valida:");
                    System.out.println("1.Individual");
                    System.out.println("2.Doble");
                    System.out.println("3.Suite");
                    otipo = sc.nextInt();
                }

                TipoDeHabitacion tipo;
                double precio;
                if (otipo == 1) {
                    tipo = TipoDeHabitacion.INDIVIDUAL;
                    precio = 50;
                } else if (otipo == 2) {
                    tipo = TipoDeHabitacion.DOBLE;
                    precio = 75;
                } else {
                    tipo = TipoDeHabitacion.SUITE;
                    precio = 100;
                }
                Habitacion habitacion = new Habitacion(tipo, precio, true, hotel.habitaciones.size()+1);
                hotel.registrarHabitacion(habitacion);

                break;
                case 2:
                    System.out.println("RESERVAR HABITACION");
                    hotel.listarHabitaciones();
                    System.out.println(" ");
                    System.out.println("Ingrese el numero de habitacion que desea reservar:");
                    int numero = sc.nextInt();
                    System.out.println("Ingrese las noches de estadía:");
                    int noches = sc.nextInt();
                    if (noches < 1) {
                        throw new NochesInvalidas();
                    }
                    hotel.reserva(numero, noches);
                    break;
                    case 3:
                        System.out.println("LIBERAR HABITACION");
                        System.out.println("Ingrese el numero de habitacion que desea liberar:");
                        int numero2 = sc.nextInt();
                        hotel.liberarHabitacion(numero2);
                        break;
                        case 4:
                            return;
            }
        }


    }
}