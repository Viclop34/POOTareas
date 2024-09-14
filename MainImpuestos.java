import java.util.Scanner;
public class MainImpuestos {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        int seleccion;
        System.out.println("Ingrese 1, si desea calcular solo el los ingresos");
        System.out.println("Ingrese 2, si desea calcular Ingresos y porcentaje impuesto");
        System.out.println("Ingrese 3, si desea calcular Dividendos, porcentaje impuesto y exencion");
        seleccion = scanner.nextInt();

        while (seleccion < 1 || seleccion > 3){
            System.out.println("Selección invalida");
            System.out.println("Ingrese un dato valido");
            seleccion = scanner.nextInt();
        }
        
        if (seleccion == 1){
            System.out.println("Introduzca el ingreso: ");
            int ingreso = scanner.nextInt();

            CalculadoraImpuestos calcular = new CalculadoraImpuestos(ingreso);
            calcular.calcularImpuestos(ingreso);
        }
        else if (seleccion == 2){
            System.out.println("Introduzca el ingreso: ");
            int ingreso = scanner.nextInt();
            System.out.println("Introduzca el porcentaje impuesto: ");
            double porcentajeImpuestos = scanner.nextDouble();

            CalculadoraImpuestos calcular = new CalculadoraImpuestos(ingreso, porcentajeImpuestos);
            calcular.calcularImpuestos(ingreso, porcentajeImpuestos);
        }
        else {
            System.out.println("Introduzca el porcentaje impuesto: ");
            double porcentajeImpuestos = scanner.nextDouble();
            System.out.println("Introduzca el dividendo: ");
            double dividendos = scanner.nextDouble();
            System.out.println("Introduzca la exencion: ");
            double exencion = scanner.nextDouble();

            CalculadoraImpuestos calcular = new CalculadoraImpuestos(porcentajeImpuestos, dividendos, exencion);
            calcular.calcularImpuestos(porcentajeImpuestos, dividendos, exencion);
        }
     
        
    }
}

