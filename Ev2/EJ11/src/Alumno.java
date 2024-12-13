

public class Alumno {
    private String nombre;
    private String apellido;
    private String centroEducativo;


    public Alumno(String nombre, String apellido, String centroEducativo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.centroEducativo = centroEducativo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", centroEducativo='" + centroEducativo + '\'' +
                '}';
    }
}
