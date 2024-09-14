public class Main {
    public static void main(String[] args) {

        Curso matematicas = new Curso("Matematicas", "Math03","David");
        Curso geografia = new Curso("Geografia", "GeoF34","Isabel");
        Curso quimica = new Curso("Quimica", "QuiX42","Laura");

        Estudiante estudiante = new Estudiante("Pablo","324254D");
        Estudiante estudiante2 = new Estudiante("Ricardo", "324222D");

        estudiante.agregarCurso(quimica);
        estudiante.agregarCurso(matematicas);

        estudiante2.agregarCurso(geografia);
        estudiante2.agregarCurso(matematicas);

        estudiante.mostrarInfoEstudiante();
        estudiante2.mostrarInfoEstudiante();

    
    }
}