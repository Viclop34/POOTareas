package usuarios.medicos;

import usuarios.Usuario;
import utils.Rol;

import java.time.LocalDate;

public class Medico extends Usuario {

    private String rfc;

    //constructor
    public Medico(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String email, String rfc, String contrasena) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasena, email, Rol.MEDICO);
        this.rfc = rfc;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + String.format("RFC: " + rfc);
    }
    public String getRfc() {
        return rfc;
    }
}
