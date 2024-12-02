public class Mamifero extends Animal {
    private String tipoPelo;

    public Mamifero(int edad, String nombre, String especie, String tipoPelo) {
        super(edad, nombre, especie);
        this.tipoPelo = tipoPelo;
    }

    @Override
    public double darComida(double Kg) {
        return 4;
    }
}
