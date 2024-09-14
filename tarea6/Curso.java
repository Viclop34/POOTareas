public class Curso {
    public String nombreCurso;
    public String codigoCurso;
    public String instructor;

    public Curso (String nombreCurso, String codigoCurso, String instructor){
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }

    public void mostrarInfoCurso(){
        System.out.println("El nombre del curso es: " + nombreCurso );
        System.out.println("El codigo del curso es: " + codigoCurso );
        System.out.println("El nombre del instructor es: " + instructor );
    }
}
