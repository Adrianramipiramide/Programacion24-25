public class Biblioteca {
    String Localidad;
    String nombre;
    int numLibros;
    int bibliotecarios;


    public Biblioteca(String localidad, String nombre, int numLibros, int bibliotecarios) {
        Localidad = localidad;
        this.nombre = nombre;
        this.numLibros = numLibros;
        this.bibliotecarios = bibliotecarios;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumLibros() {
        return numLibros;
    }

    public int getBibliotecarios() {
        return bibliotecarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "Localidad='" + Localidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numLibros=" + numLibros +
                ", bibliotecarios=" + bibliotecarios +
                '}';
    }
}
