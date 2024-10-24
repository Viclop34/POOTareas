package usuarios;

import expedientes.Expediente;
import utils.Rol;

import java.time.LocalDate;

public class Usuario {
    public String id;
    public String nombre;
    public String apellidos;
    public LocalDate fechaNacimiento;
    public String telefono;
    private String contrasena;
    public String email;
    public Rol rol;
    public Expediente expediente;// enum

    public Usuario(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contrasena,String email, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.email = email;
        this.rol = rol;
    }

    protected String mostrarInformacion() {
        String datos = String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, telefono: %s, email: %s",
                id,
                nombre,
                apellidos,
                fechaNacimiento,
                telefono,
                email);
        return datos;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContrasena() { return contrasena; }

    public String getEmail() { return email; }

    public Rol getRol() {return rol;}
}


