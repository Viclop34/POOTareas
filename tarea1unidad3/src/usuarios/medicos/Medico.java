package usuarios.medicos;

import usuarios.Usuario;
import utils.Rol;

import java.time.LocalDate;

public class Medico extends Usuario {

    private String rfc;

    //constructor
    public Medico(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc, String contrasena) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasena, Rol.MEDICO);
        this.rfc = rfc;
    }

    public String mostrarDatosMedico(){
        String datosMedico = String.format("Id: %s, Nombres: %s, Apellidos: %s, Fecha De Nacimiento: %s, Telefono: %s, RFC: %s",
                id, nombre, apellidos, fechaNacimiento, telefono, rfc);

        return datosMedico;
    }
    public String getRfc() {
        return rfc;
    }
}
