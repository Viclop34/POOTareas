package usuarios.administrador;

import usuarios.Usuario;
import utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    private Double sueldo;
    private String rfc;
    private int anosTrabajados;

    public Administrador(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc, int anosTrabajados, double sueldo, String contrasena, Rol rol ) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasena, Rol.ADMIN);
        this.rfc = rfc;
        this.anosTrabajados = anosTrabajados;
        this.sueldo = sueldo;
    }

    public void mostrarDatosAdministrador(){
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("RFC: " + getRfc());
        System.out.println("Ano Trabajados: " + getAnosTrabajados());
        System.out.println("Sueldo: " + getSueldo());

    }
    public Double getSueldo() {
        return sueldo;
    }
    public int getAnosTrabajados() {
        return anosTrabajados;
    }
    public String getRfc() {
        return rfc;
    }
}
