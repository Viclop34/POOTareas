import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Bienvenido al Hospital Las Rosas ");
        System.out.println("Introduzca la opción que desee:  ");
        System.out.println("1. Registrar paciente");
        System.out.println("2. Registrar medico");
        System.out.println("3. Solicitar consulta");
        System.out.println("4. Ver los consultorios disponibles");
        System.out.println("5. Ver informacion de consulta");
        System.out.println("6. Ver informacion MEDICO");
        System.out.println("7. Ver informacion PACIENTE");
        System.out.println("8. Salir");
        opcion = sc.nextInt();

        while(opcion != 8){
            System.out.println("La opcion ingresada no es valida");
            System.out.println(" ");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Solicitar consulta");
            System.out.println("4. Ver los consultorios disponibles");
            System.out.println("5. Ver informacion de consulta");
            System.out.println("6. Ver informacion MEDICO");
            System.out.println("7. Ver informacion PACIENTE");
            System.out.println("8. Salir");
            opcion = sc.nextInt();
        }
        switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                return;
        }
    }
}