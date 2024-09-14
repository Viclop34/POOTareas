public class Main {
        public static void main(String[] args) {
            Coche cocheUno = new Coche("Nissan", "GTR", 2000);
            Coche cocheDos = new Coche("Lamborghini", "Aventador", 2010);
            Coche cocheTres = new Coche("BMW", "G3", 2004);
    
            cocheUno.mostrarInformacion();
            cocheUno.calcularEdadDelCoche();
            System.out.println("");
    
            cocheDos.mostrarInformacion();
            cocheDos.calcularEdadDelCoche();
            System.out.println("");
    
            cocheTres.mostrarInformacion();
            cocheTres.calcularEdadDelCoche();
    
    
            
        }
    
    }

