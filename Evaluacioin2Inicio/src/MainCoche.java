public class MainCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Verde", "Urus");
        Coche coche2 = new Coche("Amarillo", "CX5");
        Motor motor1 = new Motor("X", 120);
        Coche coche5 = Coche.comprarCoche();
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
        //Velocidad en km
        Coche.convertirAKm(coche1.getVelocidad());
        Coche.totalCoche();
        coche2.desmontarMotor(coche2);
    }
}
