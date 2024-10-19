package expedientes;

import consultas.Consulta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Expediente {
    public String id;
    public Consulta consulta;
    public String observvaciones;
    public LocalDate fechaExpediente;

    public Expediente(Consulta consulta, String observaciones) {
        this.id = id;
        this.consulta = consulta;
        this.observvaciones = observvaciones;
        this.fechaExpediente = LocalDate.now();
    }

    public String generarId() {
        Random random = new Random();
        LocalDate fecha = LocalDate.now();
        // P-{ano actual}--{mes actual}--{longitud usuarios.pacientes + 1}--{1,100000}
        int anoActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int numeroAleatorio = random.nextInt(1,100000);

        String id = String.format("E%d%d%d",anoActual,mesActual, numeroAleatorio);
        return id;

    }
}
