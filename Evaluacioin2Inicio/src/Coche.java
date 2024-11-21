import java.util.Scanner;

/*
Crea una clase llamada Coche que tenga atributos para el color, el modelo y la velocidad.
Define un metodo acelerar() que aumente la velocidad del coche en 10 unidades y un
metodo frenar() que la disminuya en 10 unidades.
 */
public class Coche {
    private Motor motor;
    private String color;
    private String modelo;
    private int velocidad;
    private int acelerar;
    private static int toatalCoches = 0;

    public Coche(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
        this.acelerar = +15;
        toatalCoches++;
    }


    public Coche(String color, String modelo,Motor motor) {
        this.motor = motor;
        this.color = color;
        this.modelo = modelo;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public int acelerar() {
        this.velocidad += 10;

        return velocidad;
    }

    public int aceleracionConcreta() {
        this.velocidad += acelerar;
        return velocidad;
    }

    public int frenar() {
        if (velocidad < 10) {
            this.velocidad = velocidad;
        } else {
            this.velocidad -= 10;
        }

        return velocidad;
    }

    public int getVelocidad() {
        System.out.println(velocidad);
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public static int convertirAKm(int velocidad) {
        int kilometros = velocidad * 1609;
        System.out.printf("La velocidad del coche es %d \n", kilometros / 1000);
        return kilometros;
    }

    public Motor desmontarMotor(Coche coche){
        System.out.println("\nEl motor ha sido desmontado");
        return motor;
    }

    public static int totalCoche() {

        System.out.printf("El numero total de coches es %d",toatalCoches);
        return toatalCoches;
    }

    public  static Coche comprarCoche(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el modelo");
        String modelo = sc.nextLine();
        System.out.println("Introduce el color");
        String color = sc.nextLine();
        System.out.println("Introduce la potenca");
        int potencia = sc.nextInt();
        System.out.println("Introduce el tipo de motor");
        String tipoMotor = sc.nextLine();
        return new Coche(color, modelo, new Motor(tipoMotor, potencia));
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", motor=" + motor +
                '}';
    }
}
