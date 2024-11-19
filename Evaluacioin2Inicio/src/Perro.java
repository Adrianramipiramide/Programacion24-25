public class Perro {
    private int edad;
    private String nombre;
    private String color;
    private double peso;


    public Perro(int edad, String nombre, String color, double peso) {
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }

    public void ladrar(){
        System.out.println("Guau Guau");
    }

    public int getEdad(){
        System.out.println("La edad de " + nombre + " es " + edad);
        return edad;
    }

    public String getColor(){
        System.out.println("El color es " + color);
        return color;
    }
}
