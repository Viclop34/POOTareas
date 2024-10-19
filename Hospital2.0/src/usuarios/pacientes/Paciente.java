package usuarios.pacientes;

import expedientes.Expediente;
import usuarios.Usuario;
import utils.Rol;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Usuario {
    public String tipoSangre;
    public char sexo;


    //constructor
    public Paciente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String tipoSangre, char sexo, String telefono, String contrasena) {
        super(id, nombre, apellidos, fechaNacimiento, telefono,contrasena, Rol.PACIENTE);
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
        ArrayList<Expediente> listaExpediente = new ArrayList<>();
    }

    public String mostrarDatos() {
        String datos = String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, tipo de sangre: %s, sexo: %c, telefono: %s",
                id,
                nombre,
                apellidos,
                fechaNacimiento,
                tipoSangre,
                sexo,
                telefono);
        return datos;
    }

    public void registrarExpediente(Expediente expediente) {
        // FALTA POR RESOLVER
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }
}
