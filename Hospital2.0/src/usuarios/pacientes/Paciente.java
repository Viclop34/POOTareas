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
    @Override
    public String mostrarInformacion() {
       String datosPaciente = String.format("tipo de sangre: %s, Sexo : %s", tipoSangre, sexo);
        return super.mostrarInformacion() + datosPaciente;
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
