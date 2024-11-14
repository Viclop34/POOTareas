import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("INGRESAR LA OPCION DESEADA");
            System.out.println("1. ESCRIBIR UNA TAREA");
            System.out.println("2. LEER TAREAS");
            System.out.println("3. SALIR");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.println("ESCRIBA LA TAREA");
                    String texto = sc.nextLine();

                    try (FileWriter escribir = new FileWriter("Tareas.txt",true);
                         BufferedWriter a1 = new BufferedWriter(escribir);){
                        a1.write(texto);
                    } catch (IOException e) {
                        System.out.println("Error al escribir");
                    }
                    break;
                    case 2:
                        System.out.println("LEER TAREAS");

                        try (FileReader leer = new FileReader("Tareas.txt");){
                            String lectura;

                            BufferedReader b1 = new BufferedReader(leer);
                                while ((lectura = b1.readLine()) != null) {
                                    System.out.println(lectura);
                                }
                        }
                        break;
                        case 3:
                            return;
            }
        }
        }
    }
