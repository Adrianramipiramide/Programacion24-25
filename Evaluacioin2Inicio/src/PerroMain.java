public class PerroMain {
    public static void main(String[] args) {
        Perro perro1 = new Perro(4,"Josema","Negro",12.5);
        Perro perro2 = new Perro(5, "Moreno", "Gris",9.12);

        perro2.getEdad();
        perro1.ladrar();
        perro1.getEdad();
        perro2.getColor();
        perro1.getNombre();
        System.out.println(perro1);
    }
}
