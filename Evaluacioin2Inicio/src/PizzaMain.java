public class PizzaMain {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("mediana","Margarita");

        System.out.println(pizza1.getSize());
        pizza1.servirPizza();
        System.out.println(pizza1);
        Pizza pizza2 = new Pizza("mediana","Cuatro quesos");
        Pizza pizza3 = new Pizza("familiar","Marinera");

        pizza2.servirPizza();
        pizza3.servirPizza();
        Pizza pizza4 = new Pizza("familiar","Margarita");

        System.out.println("El numero de pizzas servidas son "+Pizza.contadroServidas);
        System.out.println("El numero de pizzas pedidas son " + Pizza.contadroPedidas);
    }
}
