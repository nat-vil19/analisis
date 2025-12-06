
package Modelo;

import java.util.Date;

public class Turista {
    // 1. Atributos (campos de la tabla Turista)
    private long idTurista; 
    private String documentoIdentidad;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
    private String nacionalidad;
    private String email;
    private String telefono;
    private java.util.Date fechaRegistro;

    //Constructor
    public Turista() {
    }

    //Getters y Setters
    public long getIdTurista() {
        return idTurista;
    }

    public void setIdTurista(long idTurista) {
        this.idTurista = idTurista;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
