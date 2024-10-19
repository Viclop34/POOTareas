package menu;

import hospital.Hospital;
import usuarios.pacientes.Paciente;

import java.util.Scanner;

public class MenuPaciente {
    private Scanner sc = new Scanner(System.in);
    public int mostrarMenu() {
            System.out.println("* Sistema Hospital *");
            System.out.println("1. Ver mis consultas");
            System.out.println("2. Ver mis datos");
            System.out.println("3. Ver mi expediente");
            System.out.println("4. Salir");

            System.out.println("Selecciona una opcion");
            int opcion = sc.nextInt();
            return opcion;
    }

    public void procesarDatosMenu(int opcion, Hospital hospital, Paciente paciente) {
        switch (opcion){
            case 1:
                sc.nextLine();
                System.out.println("MIS CONSULTAS");
                System.out.println("Ingrese su id: ");
                String idPaciente = sc.nextLine();
                hospital.verConsultasPaciente(idPaciente);

                break;

            case 2:
                sc.nextLine();
                System.out.println("MIS DATOS ");
                System.out.println("Ingrese su id: ");
                String miIdPaciente = sc.nextLine();
                hospital.mostrarPacientePorId(miIdPaciente);
                //Mostrar datos de paciente
                break;
            case 3:
                sc.nextLine();
                break;

            case 4:
                return;
        }
    }

    }

