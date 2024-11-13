public class MainCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Verde", "Urus");
        coche1.acelerar();
        coche1.frenar();
        coche1.acelerar();
        coche1.acelerar();
        coche1.getVelocidad();
        coche1.setColor("Rojo");
        coche1.setVelocidad(125);
        coche1.getVelocidad();
        coche1.acelerar();
        coche1.getVelocidad();
        System.out.println(coche1);


    }
}
