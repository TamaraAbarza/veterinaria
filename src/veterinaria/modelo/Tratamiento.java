package veterinaria.modelo;

public class Tratamiento {

    private int idTratamiento;
    private String descripcion;
    private String medicamento;
    private double importe;
    private String tipoTratamiento;
    private boolean activo;

    public Tratamiento(int idTratamiento, String descripcion, String medicamento, double importe, String tipoTratamiento,  boolean activo) {
        this.idTratamiento = idTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.tipoTratamiento = tipoTratamiento;
        this.activo = activo;
    }

    public Tratamiento(String descripcion, String medicamento, double importe, String tipoTratamiento, boolean activo) {
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.tipoTratamiento = tipoTratamiento;
        this.activo = activo;
    }

    public Tratamiento() {
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "idTratamiento: " + idTratamiento + ", descripcion: " + descripcion + ", medicamento: " + medicamento + ", importe: " + importe + ", tipoTratamiento: " + tipoTratamiento + ", activo: " + activo;
    }


}
