import java.util.ArrayList;

public class Estudiante {
    public ArrayList<Curso> listaCursos = new ArrayList<Curso>();

    private String nombre;
    private String idEstudiante;

 public Estudiante(String nombre, String idEstudiante) {
    this.nombre = nombre;
    this.idEstudiante = idEstudiante;


 }
 public void agregarCurso(Curso curso){
   this.listaCursos.add(curso);
 }

 public void mostrarInfoEstudiante(){
   System.out.println(String.format("El nombre del estudiante es: %s",this.nombre));
   System.out.println(String.format("El Id del estudiante es: %s",this.idEstudiante));
   System.out.println("Los cursos del estudiante son: ");

   System.out.println("");

   for (int i = 0; i < this.listaCursos.size(); i++) {
      this.listaCursos.get(i).mostrarInfoCurso();
      System.out.println("");
   }
 }

 public String getNombre() {
   return this.nombre;
 }

 public String getIdEstudiante() {
   return this.idEstudiante;
 }

 public void setNombre(String nombre) {
   this.nombre = nombre;
 }

 public void setIdEstudiante(String idEstudiante) {
   this.idEstudiante = idEstudiante;
 }
}
