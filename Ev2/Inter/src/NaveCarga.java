public class NaveCarga extends NaveEspacial{
    private int carga;

    public NaveCarga(String nombre, int velocidad, int carga) {
        super(nombre, velocidad);
        this.carga = carga;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("NaveEspacial " + getNombre()+
                ", nombre='" +
                ", velocidad="+ getVelocidad() );
    }
}
