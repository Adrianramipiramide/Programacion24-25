public abstract class Personaje implements Combatiente, Habilidad{
    private String nombre;
    private int edad;
    private int vida;
    private TipoArma tipoArma;

    public Personaje(String nombre, int edad, int vida, TipoArma tipoArma) {
        this.nombre = nombre;
        this.edad = edad;
        this.vida = vida;
        this.tipoArma = tipoArma;
    }

    public abstract int usarHabilidad(int vida, Personaje personaje);

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public TipoArma getTipoArma() {
        return tipoArma;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", vida=" + vida +
                '}';
    }
}
