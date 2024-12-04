/*
Crea un sistema simple para gestionar naves espaciales en una flota intergaláctica. Debes implementar una clase base llamada "NaveEspacial" y dos clases derivadas:
"NaveCarga" y "NaveExploracion".
La clase NaveEspacial debe tener:
Atributos: nombre, velocidadMaxima Métodos: acelerar(), frenar(), obtenerInformacion()
La clase NaveCarga debe:
Heredar de NaveEspacial Tener un atributo adicional: capacidadCarga Sobrescribir el metodo obtenerInformacion() para incluir la capacidad de carga
La clase NaveExploracion debe:
Heredar de NaveEspacial Tener un atributo adicional: alcanceSensores Sobrescribir el metodo obtenerInformacion()
para incluir el alcance de los sensores Crea una clase principal llamada "FlotaEspacial" con un metodo main que:
Cree al menos una instancia de cada tipo de nave Llame a los métodos acelerar() y frenar() para cada nave Muestre la información de todas las naves creadas
 */
public abstract class NaveEspacial {
    final private int  velocidadMax = 100;
    private String nombre;
    private int velocidad = 0;

    public NaveEspacial(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int acelerar(){
        velocidad += 10;
        return velocidad;
    }

    public int frenar (){
        velocidad -= 10;
        return velocidad;
    }

    public abstract void mostrarInfo();

    @Override
    public String toString() {
        return "NaveEspacial " +
                "velocidadMax=" + velocidadMax +
                ", nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad ;
    }
}
