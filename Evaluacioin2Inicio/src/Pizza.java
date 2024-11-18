/*
Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el tamaño.
Sobre cada pizza se necesita saber el tamaño (mediana o familiar), el tipo (margarita, cuatro quesos o marinera)
y su estado (pedida o servida). La clase debe almacenar información sobre el número total de pizzas que se han
pedido y que se han servido. Siempre que se crea una pizza nueva, su estado es "pedida".
Crea una clase de prueba que haga que responda como en el ejemplo de salida, en la imagen adjunta.
 */

public class Pizza {
    static int contadroServidas = 0;
    static int contadroPedidas = 0;
    private String size;
    private String tipo;
    private boolean servida;


    public Pizza(String size, String tipo) {

        this.size = size;
        this.tipo = tipo;
        this.servida = false;
         contadroPedidas++;
    }

    public String getSize() {

        return size;
    }

    public boolean servirPizza() {
        servida = true;
        System.out.println("La pizza " + tipo + " esta servida");
        contadroServidas++;
        return true;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "estado=" + servida +
                ", tipo='" + tipo + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
