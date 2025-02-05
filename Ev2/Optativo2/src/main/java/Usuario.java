public class Usuario {
    private String nombre;
    private double saldo;
    private int numApuestrasRealizadas ;

    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        System.out.println(saldo);
        return saldo;
    }

    public int getNumApuestrasRealizadas() {
        System.out.println(numApuestrasRealizadas);
        return numApuestrasRealizadas;
    }

    public void realizarApuestra(double cantidadApostada) {
        numApuestrasRealizadas++;
        double resultado = Math.random()*10;
        if(saldo<cantidadApostada){
            throw new IllegalArgumentException("No dispone de suficiente saldo");
        }
        if(resultado<5) {
            saldo += cantidadApostada-1;
        }else {
            saldo -= cantidadApostada;
        }
    }


}
