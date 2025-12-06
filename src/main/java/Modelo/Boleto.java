package Modelo;

import java.util.Date;

public class Boleto {
    private long idBoleto; 
    private long idTurista;
    private long idCircuito; 
    private long idHorario; 
    private String codigoQr; 
    private Date fechaEmision;
    private Date fechaVisita;
    private String estado;
    private double precio; 
    private String tipoBoleto;

    public Boleto() {
    }

    public long getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(long idBoleto) {
        this.idBoleto = idBoleto;
    }

    public long getIdTurista() {
        return idTurista;
    }

    public void setIdTurista(long idTurista) {
        this.idTurista = idTurista;
    }

    public long getIdCircuito() {
        return idCircuito;
    }

    public void setIdCircuito(long idCircuito) {
        this.idCircuito = idCircuito;
    }

    public long getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(long idHorario) {
        this.idHorario = idHorario;
    }

    public String getCodigoQr() {
        return codigoQr;
    }

    public void setCodigoQr(String codigoQr) {
        this.codigoQr = codigoQr;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoBoleto() {
        return tipoBoleto;
    }

    public void setTipoBoleto(String tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }
    
    
}
