import java.util.Scanner;
public class MainEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su sueldo base: ");
    double sueldoBase = scanner.nextDouble();

    System.out.println("Ingrese su bonificacion (0 indicara que no tiene bonificacion): ");
    double bonificacion = scanner.nextDouble();
    
        if (bonificacion != 0){
            System.out.println("Ingrese sus horas extra (0 indicara que no tiene horas extra): ");
            double horasE = scanner.nextDouble();
            
            if(horasE != 0){
                Empleado empleado1 = new Empleado(sueldoBase, bonificacion, horasE);
                empleado1.calcularSalario(sueldoBase, bonificacion, horasE);
            }
            else {
                Empleado empleado1 = new Empleado(sueldoBase, bonificacion);
                empleado1.calcularSalario(sueldoBase, bonificacion);
            }

        }

        else {
            Empleado empleado1 = new Empleado(sueldoBase, bonificacion);
            empleado1.calcularSalario(sueldoBase);
        }  
    }
}
