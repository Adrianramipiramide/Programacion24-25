import java.time.LocalDate;

public abstract class Atleta implements Competidor{
    private String nombre;
    private LocalDate fechaNacimiento;
    private Pais pais;

    public Atleta(String nombre, LocalDate fechaNacimiento, Pais pais) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
