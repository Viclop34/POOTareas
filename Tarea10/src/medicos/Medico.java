package medicos;

public class Medico {
    public String id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private String telefono;
    private String rfc;

    //constructor
    public Medico(String id, String nombre, String apellidos, String fechaNacimiento, String telefono, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    public String mostrarDatosMedico(){
        String datosMedico = String.format("Id: %s, Nombres: %s, Apellidos: %s, Fecha De Nacimiento: %s, Telefono: %s, RFC: %s",
                id, nombre, apellidos, fechaNacimiento, telefono, rfc);

        return datosMedico;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRfc() {
        return rfc;
    }
}
