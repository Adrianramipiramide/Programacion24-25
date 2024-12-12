public class Mago extends Personaje{
    public Mago(String nombre, int edad, int vida, TipoArma tipoArma) {
        super(nombre, edad, vida, tipoArma);
    }



    @Override
    public int usarHabilidad(Personaje personaje){

        return personaje.setVida(personaje.getVida()-23);
    }
    @Override
    public int golpeEficaz(Personaje personaje){
        return personaje.setVida(getVida())-20;
    }
}
