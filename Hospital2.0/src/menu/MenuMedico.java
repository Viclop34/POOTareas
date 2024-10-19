package menu;

import hospital.Hospital;
import usuarios.medicos.Medico;

import java.util.Scanner;

public class MenuMedico {
    private Scanner sc;
    public int mostrarMenu(Medico medico, Hospital hospital) {

            System.out.println("* Sistema Hospital *");
            System.out.println("1. Ver mis Consultas actuales"); //Tarea
            System.out.println("2. Ver mis pacientes");
            System.out.println("3. Consutar paciente");
            System.out.println("4. Consultar expediente paciente");
            System.out.println("5. Completar consulta");
            System.out.println("6. Ver mis datos"); //Tareas
            System.out.println("7. Salir");

            System.out.println("Selecciona una opcion");
            int opcion = sc.nextInt();
            return opcion;


    }

    public void procesarDatosMenu(int opcion, Hospital hospital, Medico medico1) {
            switch (opcion){
                case 1:
                    boolean validadorE = false;
                    System.out.println("VER CONSULTAS");
                    System.out.println("Ingrese su id: ");
                    String idMedico = sc.nextLine();
                    hospital.mostrarConsultasMedico(idMedico);
                    break;

                case 2:
                    boolean validadorE2 = false;
                    System.out.println("VER PACIENTES");
                    System.out.println("Ingrese su id: ");
                    String idMedico2 = sc.nextLine();

                    for (Medico medico: hospital.listaMedicos){

                        if (medico.getId().equals(idMedico2)){
                            validadorE2 = true;
                        }
                    }

                    if (validadorE2){
                        hospital.mostarPacienteDeMedico(idMedico2);
                    }
                    else {
                        System.out.println("El id del Medico no existe");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    sc.nextLine();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("MIS DATOS");
                    System.out.println("Ingrese su id: ");
                    String idMedicoParaDatos = sc.nextLine();
                    hospital.mostrarMedicoPorId(idMedicoParaDatos);
                    break;
                case 7:
                    return;
            }
        }
    }

