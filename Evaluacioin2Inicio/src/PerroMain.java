public class PerroMain {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Josema","Negro",2,4.5);
        Perro perro2 = new Perro("Sebas", "Marron", 6,9.12);

        perro2.getEdad();
        perro1.ladrar();
        perro1.getNombre();
        perro2.getPeso();
        System.out.println(perro1);
    }
}
