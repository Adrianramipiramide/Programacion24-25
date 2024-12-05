public class Guerrero extends Personaje{
    private int peso;

    public Guerrero(String nombre, int edad, int vida, TipoArma tipoArma, int peso) {
        super(nombre, edad, vida, tipoArma);
        this.peso = peso;
    }
    @Override
    public int usarHabilidad(int vida, Personaje personaje){
        vida -=10;
        return vida;
    }
    @Override
    public int golpeEficaz(int vida){
        vida -= 25;
        return vida;
    }
}
