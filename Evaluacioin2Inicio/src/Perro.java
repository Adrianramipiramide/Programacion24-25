public class Perro {
    private String nombre;
    private String color;
    private int edad;
    private double peso;

    public Perro(String nombre, String color, int edad, double peso) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
    }

    public void ladrar(){
        System.out.println("Guau Guau");
    }

    public int getEdad(){
        System.out.println("La edad del perro " + nombre + " es " + edad);
        return edad;
    }
    public double getPeso(){
        System.out.println("El peso del perro " + nombre + " es " + peso);
        return peso;
    }
    public String getNombre(){
        System.out.println("El nobel del perro es " + nombre);
        return nombre;
    }

    @Override
    public String toString() {
        return "Perro " +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", peso=" + peso ;
    }
}
