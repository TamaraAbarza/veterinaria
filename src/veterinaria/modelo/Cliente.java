package veterinaria.modelo;

public class Cliente {

    private int idCliente;
    private int dni;
    private String nombre;
    private String apellido;
    private long telefono;
    private String direccion;
    private long contactoAlternativo;
    private boolean activo;

    public Cliente(int idCliente, int dni, String nombre, String apellido, long telefono, String direccion, long contactoAlternativo, boolean activo) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String apellido, long telefono, String direccion, long contactoAlternativo, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getContactoAlternativo() {
        return contactoAlternativo;
    }

    public void setContactoAlternativo(long contactoAlternativo) {
        this.contactoAlternativo = contactoAlternativo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido;
    }

}
