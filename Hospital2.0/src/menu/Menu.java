package menu;


import hospital.Hospital;
import usuarios.Usuario;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import utils.Rol;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Hospital hospital = new Hospital();

    public void login() {
        int intentosMaximos = 5, intentosUsuario = 0;

        while (intentosUsuario < intentosMaximos) {
            System.out.println("Bienvenido");
            System.out.println("Inicie Sesion para continuar");

            System.out.println("Ingrese su Id de usuario: ");
            String usuario = sc.nextLine();

            System.out.println("Ingrese su contrasena: ");
            String contrasena = sc.nextLine();

            Usuario usuarioEnSesion = hospital.validarInicioSesion(usuario, contrasena);
            if (usuarioEnSesion instanceof  Usuario) {
                if (usuarioEnSesion.getRol() == Rol.PACIENTE){
                    Paciente pacienteEnSesion = (Paciente) usuarioEnSesion;
                    MenuPaciente menuPaciente = new MenuPaciente();
                    int opcion = 0;
                    while (opcion != 4) {
                        opcion = menuPaciente.mostrarMenu();
                        menuPaciente.procesarDatosMenu(opcion, hospital,pacienteEnSesion);
                    }
                    intentosUsuario = 0;
                } else if (usuarioEnSesion.getRol() == Rol.MEDICO){
                    Medico medicoEnSesion = (Medico) usuarioEnSesion;
                    MenuMedico menuMedico = new MenuMedico();
                    int opcion = 0;
                    while (opcion != 4) {
                        opcion = menuMedico.mostrarMenu();
                        menuMedico.procesarDatosMenu(opcion, hospital, medicoEnSesion);
                    }
                    intentosUsuario = 0;
                }
                else {
                    Administrador administradorEnSesion = (Administrador) usuarioEnSesion;
                    MenuAdministracion menuAdministracion = new MenuAdministracion();
                    int opcion = 0;
                    while (opcion != 12) {
                        opcion = menuAdministracion.mostrarMenu();
                        menuAdministracion.procesarDatosMenu(opcion,hospital, administradorEnSesion);
                    }


                    intentosUsuario = 0;
                }
            }
             else {
                intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
            }
        }
    }



    private int mostrarErrorInicioSesion(int intentosUsuario){
        System.out.println("\nUsuario o contrasenia incorrectos");
        return intentosUsuario + 1;

    }

        }





