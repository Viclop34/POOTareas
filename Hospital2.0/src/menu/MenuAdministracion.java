package menu;

import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import usuarios.Usuario;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import utils.Rol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdministracion {
    private Scanner sc = new Scanner(System.in);
    public int mostrarMenu() {

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

            System.out.println("Selecciona una opcion");
            int opcion = sc.nextInt();
            return opcion;

    }

    public void procesarDatosMenu(int opcion, Hospital hospital,Administrador admin) {
        switch (opcion) {
            case 1:
                // P-{ano actual}--{mes actual}--{longitud usuarios.pacientes + 1}--{1,100000}
                System.out.println("A elegido la opcion REGISTRAR PACIENTE");
                String id = hospital.generarIdPaciente();
                sc.nextLine();

                ArrayList<String> datosPaciente = this.obtenerDatosComun(Rol.PACIENTE, hospital);

                String nombrePaciente = datosPaciente.get(0);
                String apellidoPaciente = datosPaciente.get(1);
                LocalDate fechaNacimientoPaciente = LocalDate.parse(datosPaciente.get(2));
                String numeroTelefonoPaciente = datosPaciente.get(3);
                String contrasena = datosPaciente.get(4);


                System.out.println("Ingrese el tipo de sangre del paciente: ");
                String tipoSangre = sc.nextLine();
                sc.nextLine();

                System.out.println("Ingrese el sexo del paciente: ");
                char sexo = sc.next().charAt(0);
                sc.nextLine();


                boolean numeroTelefono = hospital.numeroPaciente(numeroTelefonoPaciente);

                while(!hospital.validarTelefonoRepetido(hospital.listaUsuarios, numeroTelefonoPaciente)) {
                }


                Paciente paciente = new Paciente(id, nombrePaciente, apellidoPaciente, fechaNacimientoPaciente, tipoSangre, sexo, numeroTelefonoPaciente, contrasena);
                hospital.registrarPaciente(paciente);


                System.out.println("Paciente registrado exitosamente");
                break;

            case 2:
                System.out.println("A elegido la opcion REGISTRAR MEDICO");
                sc.nextLine();

                ArrayList<String> datosMedico = this.obtenerDatosComun(Rol.MEDICO, hospital);

                String nombreMedico = datosMedico.get(0);
                String apellidoMedico = datosMedico.get(1);
                LocalDate fechaNacimientoMedico = LocalDate.parse(datosMedico.get(2));
                String numeroTelefonoMedico = datosMedico.get(3);
                String contrasenaMedico = datosMedico.get(4);

                int anoNacimientoMedico = LocalDate.parse(datosMedico.get(2)).getYear();
                boolean numeroMedico = hospital.numeroMedico(numeroTelefonoMedico);
                while (!numeroMedico) {
                    System.out.println("El telefono ingresado ya existe ");
                    System.out.println("Ingrese el teléfono del medico: ");
                    numeroTelefonoMedico = sc.nextLine();
                    sc.nextLine();

                    numeroMedico = hospital.numeroPaciente(numeroTelefonoMedico);
                }


                System.out.println("Ingrese el RFC del medico: ");
                String rfcMedico = sc.nextLine();
                sc.nextLine();

                boolean rfcMedicoValido = hospital.rfcMedico(rfcMedico);
                while (!rfcMedicoValido) {
                    System.out.println("El RFC ingresado ya existe ");
                    System.out.println("Ingrese el RFC del medico: ");
                    rfcMedico = sc.nextLine();
                    sc.nextLine();

                    rfcMedicoValido = hospital.rfcMedico(rfcMedico);
                }


                String idMedico = hospital.generarIdMedico(apellidoMedico, anoNacimientoMedico);


                Medico medico = new Medico(idMedico, nombreMedico, apellidoMedico, fechaNacimientoMedico, numeroTelefonoMedico, rfcMedico, contrasenaMedico);
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
                System.out.println("Seleccionaste la opcion para registrar una consulta");
                sc.nextLine();

                String idConsulta = hospital.generarIdConsulta();

                System.out.println("Ingrese el dia de la consulta: ");
                int diaConsulta = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el mes de la consulta: ");
                int mesConsulta = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el ano de la consulta: ");
                int anoConsulta = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese la hora de la consulta: ");
                int horaConsulta = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese los minutos de la consulta: ");
                int minutosConsulta = sc.nextInt();
                sc.nextLine();

                LocalDateTime fechaConsulta = LocalDateTime.of(anoConsulta,mesConsulta,diaConsulta,horaConsulta,minutosConsulta);

                while (!hospital.validarFechaConsulta(fechaConsulta)){
                    System.out.println("La fecha no puede estar en el pasado ");
                    System.out.println("Ingrese el dia de la consulta: ");
                    diaConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el mes de la consulta: ");
                    mesConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el ano de la consulta: ");
                    anoConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la hora de la consulta: ");
                    horaConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese los minutos de la consulta: ");
                    minutosConsulta = sc.nextInt();
                    sc.nextLine();

                    fechaConsulta = LocalDateTime.of(anoConsulta,mesConsulta,diaConsulta,horaConsulta,minutosConsulta);
                }

                System.out.println("Ingrese el ID del paciente: ");
                String idPaciente = sc.nextLine();
                Paciente paciente1 = hospital.obtenerPacientePorId(idPaciente);
                sc.nextLine();

                while (paciente1 == null) {
                    System.out.println("El paciente no existe");
                    System.out.println("Ingrese el ID del paciente: ");
                    idPaciente = sc.nextLine();
                    paciente1 = hospital.obtenerPacientePorId(idPaciente);
                    sc.nextLine();
                }

                System.out.println("Ingrese el ID del medico: ");
                String idDoctor = sc.nextLine();
                Medico medico1 = hospital.obtenerMedicoPorId(idDoctor);
                sc.nextLine();

                while (medico1 == null) {
                    System.out.println("El medico no existe");
                    System.out.println("Ingrese el ID del medico: ");
                    idDoctor = sc.nextLine();
                    medico1 = hospital.obtenerMedicoPorId(idDoctor);
                    sc.nextLine();
                }

                System.out.println("Ingrese el numero del consultorio: ");
                int numeroConsultorio = sc.nextInt();
                sc.nextLine();
                Consultorio consultorio2 = hospital.obtenerConsultorioPorNumero(numeroConsultorio);

                while (consultorio2 == null) {
                    System.out.println("El consultorio no existe");
                    System.out.println("Ingrese el numero del consultorio: ");
                    numeroConsultorio = sc.nextInt();
                    sc.nextLine();
                    consultorio2 = hospital.obtenerConsultorioPorNumero(numeroConsultorio);
                }

                Consulta consulta = new Consulta(idConsulta, fechaConsulta, paciente1, medico1, consultorio2);
                hospital.registrarConsulta(consulta);
                if (!hospital.registrarConsulta(consulta)){
                    System.out.println("No se puede registrar la consulta");
                    break;
                }
                System.out.println("Se registro la consulta exitosamente");


                break;
            case 5:
                System.out.println("A elegido la opcion MOSTRAR PACIENTES");
                System.out.println("Los usuarios.pacientes son los siguientes: ");
                hospital.mostrarPacientes();
                sc.nextLine();
                break;
            case 6:
                System.out.println("A elegido la opcion MOSTRAR MEDICOS");
                System.out.println("Los usuarios.medicos son los siguientes: ");
                hospital.mostrarMedicos();
                break;
            case 7:
                System.out.println("A elegido la opcion MOSTRAR CONSULTORIOS");
                System.out.println("Los consultorios son los siguientes: ");
                hospital.mostrarConsultorios();
                break;
            case 8:
                System.out.println("A elegido la opcion de mostrar consultas");
                System.out.println("Las consultas son las siguientes: ");
                hospital.mostrarConsultas();
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
                sc.nextLine();
                return;
        }
    }

    private ArrayList<String> obtenerDatosComun(Rol rol, Hospital hospital) {
        String tipoUsuario = rol == Rol.PACIENTE ? "paciente": rol == Rol.MEDICO ? "medico" : "administrador";
        ArrayList<String> datosEnComun = new ArrayList();

        System.out.println(String.format("Ingrese el nombre del %s", tipoUsuario));
        String nombre = sc.nextLine();
        sc.nextLine();
        datosEnComun.add(nombre);

        System.out.println(String.format("Ingrese el apellido del %s", tipoUsuario));
        String apellido = sc.nextLine();
        sc.nextLine();
        datosEnComun.add(apellido);

        datosEnComun.add(obtenerFechaNacimientoUsuario(tipoUsuario));

        boolean telefonoValido = false;
        String numeroTelefono = sc.nextLine();
        while (!telefonoValido) {
            System.out.println(String.format("Ingrese el numero de telefono del %s", tipoUsuario));
            numeroTelefono = sc.nextLine();
            telefonoValido = hospital.validarTelefonoRepetido(rol == Rol.PACIENTE ? hospital.listaPacientes : hospital.listaMedicos, tipoUsuario);
        }
        datosEnComun.add(numeroTelefono);


        System.out.println(String.format("Ingrese el telefono del %s", tipoUsuario));
        String telefono = sc.nextLine();
        datosEnComun.add(telefono);
        sc.nextLine();

        System.out.println("Ingrese una contrasena:");
        String contrasena = sc.nextLine();
        datosEnComun.add(contrasena);

        return datosEnComun;

    }


    private String obtenerFechaNacimientoUsuario(String tipoUsuario) {
        boolean fechaValida = false;
        LocalDate fechaNacimiento = LocalDate.now();

        while (!fechaValida) {

            System.out.println(String.format("Ingrese el ano de nacimiento del %s", tipoUsuario));
            int anoNacimiento = sc.nextInt();

            System.out.println(String.format("Ingrese el mes de nacimiento del %s", tipoUsuario));
            int mesNacimiento = sc.nextInt();

            System.out.println(String.format("Ingrese el dia de nacimiento del %s", tipoUsuario));
            int diaNacimiento = sc.nextInt();

            fechaNacimiento = LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento);


            if (fechaNacimiento.isAfter(LocalDate.now())) {
                System.out.println("La fecha de nacimiento no puede estar en el futuro");
            } else {
                fechaValida = true;
            }
        }
        return fechaNacimiento.toString();
    }
    }

