import java.util.Date;

public class Proyecto {
    String id;
    String nombre;
    EnergiasRenovables tipo;
    double capacidad;
    String ciudad;
    String provincia;
    double latitud;
    double altitud;
    Date fecha;
    double presupuesto;
    boolean estado;

    public Proyecto(String nombre){
        this.nombre= nombre;
    }

    public Proyecto(String id, String nombre, EnergiasRenovables tipo, double capacidad, String ciudad, String provincia, double latitud, double altitud, Date fecha, double presupuesto, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.latitud = latitud;
        this.altitud = altitud;
        this.fecha = fecha;
        this.presupuesto = presupuesto;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnergiasRenovables getTipo() {
        return tipo;
    }

    public void setTipo(EnergiasRenovables tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
