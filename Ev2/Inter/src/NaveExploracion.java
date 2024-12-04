public class NaveExploracion extends NaveEspacial{

    public NaveExploracion(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("NaveEspacial " + getNombre()+
                ", nombre='" +
                ", velocidad="+ getVelocidad() );
    }
}
