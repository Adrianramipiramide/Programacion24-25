public abstract class Animal {

    private int edad;
    private String nombre;
    private String especie;

    public Animal(int edad, String nombre, String especie) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
    }

    public String describir(){
        String descripcion = "El animal " + nombre + " tiene " + edad + " y es de la especie " + especie;
        return descripcion;
    }

    public abstract double darComida(double Kg);



}
