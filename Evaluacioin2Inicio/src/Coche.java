/*
Crea una clase llamada Coche que tenga atributos para el color, el modelo y la velocidad.
Define un metodo acelerar() que aumente la velocidad del coche en 10 unidades y un
metodo frenar() que la disminuya en 10 unidades.
 */
public class Coche {
    private String color;
    private String modelo;
    private int velocidad;
    private int acelerar;

    public Coche(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
        this.acelerar  = +15;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int acelerar() {
        this.velocidad += 10;

        return velocidad;
    }

    public int aceleracionConcreta(){
        this.velocidad += acelerar;
        return velocidad;
    }

    public int frenar() {
        if(velocidad<10){
            this.velocidad=velocidad;
        }else {
            this.velocidad -= 10;
        }

        return velocidad;
    }

    public int getVelocidad(){
        System.out.println(velocidad);
        return velocidad;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", acelerar=" + acelerar +
                '}';
    }
}