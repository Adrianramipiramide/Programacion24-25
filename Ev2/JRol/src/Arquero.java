public class Arquero extends Personaje{

    public Arquero(String nombre, int edad, int vida, TipoArma tipoArma) {
        super(nombre, edad, vida, tipoArma);
    }
    @Override
    public int usarHabilidad(Personaje personaje){
        System.out.println("Tirando flechas Flechas");
        return personaje.setVida(personaje.getVida()-50);
    }
    @Override
    public int golpeEficaz(Personaje personaje){
        return personaje.setVida(getVida())-30;
    }
}
