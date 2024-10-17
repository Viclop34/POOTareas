package consultas;

import consultorios.Consultorio;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import utils.Status;

import java.time.LocalDateTime;

public class Consulta {
    public String id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;
    public Status status;


//    constructor
    public Consulta(String id, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.status = Status.PENDIENTE;
    }
//    getter

    public String getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public Status getStatus() {
        return status;
    }

    public String mostrarDatosConsulta() {
        return String.format("Id de la Consulta: %s, \nFecha: %s,\nId del Paciente: %s,\nNombre del Paciente: %s, \nId del Medico: %s, \nNombre del Medico: %s \nPiso del Consultorio: %d \nNumero del Consultorio: %d", id
                , fechaHora, paciente.getId(), paciente.getNombre()
                , medico.getId(), medico.getNombre(), consultorio.getPiso(), consultorio.getNumeroConsultorio());
    }
}

