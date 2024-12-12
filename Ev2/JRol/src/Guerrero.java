public class Guerrero extends Personaje{
    private int peso;

    public Guerrero(String nombre, int edad, int vida, TipoArma tipoArma, int peso) {
        super(nombre, edad, vida, tipoArma);
        this.peso = peso;
    }
    @Override
    public int usarHabilidad(Personaje personaje){
        return personaje.setVida(personaje.getVida()-10);
    }
    @Override
    public int golpeEficaz(Personaje personaje){
        return personaje.setVida(personaje.getVida())-13;
    }
}
