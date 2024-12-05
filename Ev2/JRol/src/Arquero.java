public class Arquero extends Personaje{

    public Arquero(String nombre, int edad, int vida, TipoArma tipoArma) {
        super(nombre, edad, vida, tipoArma);
    }
    @Override
    public int usarHabilidad(int vida, Personaje personaje){
        System.out.println("Tirando flechas Flechas");
        vida -=18;
        return vida;
    }
    @Override
    public int golpeEficaz(int vida){
        vida -= 10;
        return vida;
    }
}
