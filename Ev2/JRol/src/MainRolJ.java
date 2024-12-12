import java.util.ArrayList;

/*
Desarrolla un sistema para un juego de rol que incorpore interfaces, herencia, polimorfismo, comparadores y enumeraciones.
El juego debe incluir los siguientes elementos:
Una interfaz Combatiente que defina métodos comunes para todos los personajes que pueden luchar.
Una clase abstracta Personaje que implemente Combatiente y contenga atributos y métodos comunes.
Clases concretas que hereden de Personaje: Guerrero, Mago y Arquero.
Una enumeración TipoArma que incluya diferentes tipos de armas.
Una interfaz Habilidad y clases que la implementen para representar habilidades especiales.
Un sistema de inventario que use un comparador para ordenar los objetos por valor.
Un metodo polimórfico usarHabilidad() que se comporte de manera diferente según la clase del personaje.
Una clase Batalla que simule un combate entre personajes, utilizando sus habilidades y armas.
Implementa el sistema completo, asegurándote de utilizar correctamente interfaces, herencia, polimorfismo,
comparadores y enumeraciones. Incluye un metodo main() que demuestre el funcionamiento del sistema.
 */
public class MainRolJ {
    public static void main(String[] args) {
        Arquero arquero1 = new Arquero("Jose", 35,70, TipoArma.Arco);
        Mago mago1 = new Mago("Julian", 26,80, TipoArma.FrancoTirador);
        Guerrero guerrero1 = new Guerrero("Pedro",40,100, TipoArma.Cuchillo, 80);


        ArrayList<Personaje> listaPersonaje =new ArrayList<>();
        listaPersonaje.add(arquero1);
        listaPersonaje.add(mago1);
        listaPersonaje.add(guerrero1);


        System.out.println(arquero1.usarHabilidad(mago1));
        System.out.println(arquero1);
        System.out.println(mago1);

    }
}
