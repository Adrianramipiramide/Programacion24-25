public class Mago extends Personaje{
    public Mago(String nombre, int edad, int vida, TipoArma tipoArma) {
        super(nombre, edad, vida, tipoArma);
    }
    @Override
    public int usarHabilidad(int vida, Personaje personaje){
        vida -=50;
        return vida;
    }
    @Override
    public int golpeEficaz(int vida){
        vida -= 15;
        return vida;
    }
}
