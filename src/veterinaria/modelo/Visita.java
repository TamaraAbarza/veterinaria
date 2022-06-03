package veterinaria.modelo;

import java.time.LocalDate;

public class Visita {

    private int idVisita;
    private Mascota mascota;
    private LocalDate fechaVisita;
    //si hay síntomas o afección
    private String detalle;
    private double peso;
    private Tratamiento tratamiento;
    private boolean activo;
    
    

    public Visita(int idVisita, Mascota mascota, LocalDate fechaVisita, String detalle, double peso, Tratamiento tratamiento, boolean activo) {
        this.idVisita = idVisita;
        this.mascota = mascota;
        this.fechaVisita = fechaVisita;
        this.detalle=detalle;
        this.peso = peso;
        this.tratamiento = tratamiento;
        this.activo = activo;
    }

    public Visita(Mascota mascota, LocalDate fechaVisita, String detalle, double peso, Tratamiento tratamiento, boolean activo) {
        this.mascota = mascota;
        this.fechaVisita = fechaVisita;
        this.detalle=detalle;
        this.peso = peso;
        this.tratamiento = tratamiento;
        this.activo = activo;
    }

    public Visita() {
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "idVisita: " + idVisita + ", mascota:" + mascota + ", fecha de la visita: " + fechaVisita +", detalle: "+detalle+ ", peso: " + peso + ", tratamiento: " + tratamiento;
    }
    
    
    
}
