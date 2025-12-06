package Modelo;

import java.sql.Time;

public class Horario {
    private long idHorario; 
    private long idCircuito; 
    private String turno;
    private Time horaInicio;
    private Time horaFin;
    private int capacidadTurno;

    public Horario() {
    }

    public long getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(long idHorario) {
        this.idHorario = idHorario;
    }

    public long getIdCircuito() {
        return idCircuito;
    }

    public void setIdCircuito(long idCircuito) {
        this.idCircuito = idCircuito;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public int getCapacidadTurno() {
        return capacidadTurno;
    }

    public void setCapacidadTurno(int capacidadTurno) {
        this.capacidadTurno = capacidadTurno;
    }
    
    
}
