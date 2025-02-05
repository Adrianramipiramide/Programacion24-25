import java.time.LocalDate;

public abstract class Atleta implements Competidor {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Pais pais;
    private int nivelEnergia;

    public Atleta(String nombre, LocalDate fechaNacimiento, Pais pais, int nivelEnergia) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
        this.nivelEnergia = nivelEnergia;
    }

    public void recuperarEnergia(){
        if(nivelEnergia>90){
            nivelEnergia += 10;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Pais getPais() {
        return pais;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }
}
