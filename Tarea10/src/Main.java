import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);
                int opcion = 0;

                while(opcion != 9) {
                    System.out.println("Bienvenido al Hospital Las Rosas ");
                    System.out.println("Introduzca la opción que desee:  ");
                    System.out.println("1. Registrar paciente");
                    System.out.println("2. Registrar medico");
                    System.out.println("3. Registrar consultorio");
                    System.out.println("4. Registrar consulta");
                    System.out.println("5. Mostrar pacientes");
                    System.out.println("6. Mostrar médicos");
                    System.out.println("7. Mostrar consultorios");
                    System.out.println("8. Mostrar consultas");
                    System.out.println("9. Mostrar paciente por id");
                    System.out.println("10. Mostrar medico por id");
                    System.out.println("11. Mostrar consultorio por id");
                    System.out.println("12. Salir");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            // P-{ano actual}--{mes actual}--{longitud pacientes + 1}--{1,100000}
                            System.out.println("A elegido la opcion REGISTRAR PACIENTE");
                            sc.nextLine();
                            String id = hospital.generarIdPaciente();
                            sc.nextLine();

                            System.out.println("Ingrese el nombre del paciente: ");
                            String nombre = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Ingrese el apellido del paciente: ");
                            String apellido = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Ingrese la fecha de nacimiento del paciente: ");
                            String fechaNacimiento = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Ingrese el tipo de sangre del paciente: ");
                            String tipoSangre = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Ingrese el sexo del paciente: ");
                            char sexo = sc.next().charAt(0);
                            sc.nextLine();

                            System.out.println("Ingrese el teléfono del paciente: ");
                            String telefono = sc.nextLine();
                            sc.nextLine();

                            Paciente paciente = new Paciente(id, nombre, apellido, fechaNacimiento, tipoSangre, sexo, telefono);
                            hospital.registrarPaciente(paciente);

                            System.out.println("Paciente registrado exitosamente");
                            break;

                        case 2:
                            System.out.println("A elegido la opcion REGISTRAR MEDICO");
                            sc.nextLine();


                            System.out.println("Ingrese el nombre del medico: ");
                            String nombreMedico = sc.nextLine();



                            System.out.println("Ingrese el apellido del medico: ");
                            String apellidoMedico = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Ingrese la fecha de nacimiento del medico: ");
                            String fechaNacimientoMedico = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Ingrese el telefono del medico: ");
                            String telefonoMedico = sc.nextLine();
                            sc.nextLine();

                            System.out.println("Ingrese el RFC del medico: ");
                            String rfcMedico = sc.nextLine();
                            sc.nextLine();


                            String idMedico = hospital.generarIdMedico(apellidoMedico, fechaNacimientoMedico);

                            Medico medico = new Medico(idMedico, nombreMedico, apellidoMedico, fechaNacimientoMedico, telefonoMedico, rfcMedico);
                            hospital.registrarMedico(medico);
                            break;

                        case 3:
                            System.out.println("A elegido la opcion REGISTRAR CONSULTORIO");
                            sc.nextLine();
                            String idConsultorio = hospital.generarIdConsultorio();
                            sc.nextLine();

                            System.out.println("Ingrese el piso del consultorio: ");
                            int piso = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese el numero del consultorio: ");
                            int numero = sc.nextInt();
                            sc.nextLine();

                            Consultorio consultorio = new Consultorio(idConsultorio, piso, numero);
                            hospital.registrarConsultorios(consultorio);
                            break;
                        case 4:
                            break;
                        case 5:
                            System.out.println("A elegido la opcion MOSTRAR PACIENTES");
                            System.out.println("Los pacientes son los siguientes: ");
                            hospital.mostrarPacientes();
                            break;
                        case 6:
                            System.out.println("A elegido la opcion MOSTRAR MEDICOS");
                            System.out.println("Los medicos son los siguientes: ");
                            hospital.mostrarMedicos();
                            break;
                        case 7:
                            System.out.println("A elegido la opcion MOSTRAR CONSULTORIOS");
                            System.out.println("Los consultorios son los siguientes: ");
                            hospital.mostrarConsultorios();
                            break;
                        case 8:
                            break;
                        case 9:
                            System.out.println("Mostrar paciente");
                            System.out.println("Ingrese el ID del paciente a buscar: ");
                            sc.nextLine();
                            String idMP = sc.nextLine();
                            hospital.mostrarPacientePorId(idMP);
                            break;
                        case 10:
                            System.out.println("Mostrar medico");
                            System.out.println("Ingrese el ID del medico a buscar: ");
                            sc.nextLine();
                            String idMed = sc.nextLine();
                            hospital.mostrarMedicoPorId(idMed);
                            break;
                        case 11:
                            System.out.println("Mostrar consultorio");
                            System.out.println("Ingrese el ID del consultorio a buscar: ");
                            sc.nextLine();
                            String idConsul = sc.nextLine();
                            hospital.mostrarConsultorioPorId(idConsul);
                            break;
                        case 12:
                            return;
                    }
                }
            }
        }