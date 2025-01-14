import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Scanner;

public class Metodos {
    public static void crearPersona(HashMap<String, Integer> personas, String nombre, int edad) {
        personas.put(nombre, edad);
    }

    public static void msotrarPersonas(HashMap<String, Integer> personas) {
        System.out.println(personas);
    }

    public static void consejos() {
        System.out.println("Haz ejercicio");
        System.out.println("Come saludable");
        System.out.println("Sal a la naturaleza");
        System.out.println("Pasa tiempo de calidad con familia y amigos");
        System.out.println("3 claves para triunfar en la vida: ACTITUD, ESFUERZO e INEGRIDAD");
    }
    static  int vida = 70;
    static int higiene = 50;
    static int fuerza = 50;
    //Juego
    public static void juego() {

        Scanner sc = new Scanner(System.in);
        System.out.println("LA PARTIDA VA A COMENZAR");
        caracteristicas();
        while (vida >= 1 && vida<100) {
            mostrarProgreso();
            ejercicio();
            comer();
            postre();
            ejercicio();
            cenar();
            eventoRandom();

            if (vida>=100) {
                System.out.println("Felicidades  has ganado");
                mostrarProgreso();

                return;
            } else if (vida<=0) {
                System.out.println("Si tu objetivo es tener una vida saludable y plena debes cambiar tus hábitos");
                mostrarProgreso();

            }


        }


    }

    public static void mostrarProgreso() {
        System.out.println("DATOS DE PROGRESOS");
        System.out.println("La vida es: " + vida);
        System.out.println("La higiene es: " + higiene);
        System.out.println("La fuerza es: " + fuerza);

        if (vida + higiene + fuerza >= 220) {
            System.out.println("FELICIDADES VAS POR EL BUEN CAMINO");
        }
    }

    public static void caracteristicas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione su género");
        System.out.println("1. Hombre");
        System.out.println("2. Mujer");
        System.out.println("3. Otro");
        int genero = sc.nextInt();
        System.out.println("¿Edad?");
        int edad = sc.nextInt();
        System.out.println("¿Peso?");
        double peso = sc.nextDouble();

        if (edad > 60) {
            vida -= 10;
            fuerza -= 10;
        }

        if (peso > 90 && genero == 1) {
            vida -= 10;
        } else if (peso > 70 && genero == 2) {
            vida -= 10;
            fuerza--;
        }

        if (genero == 3) {
            System.out.println("Ve al médico y por favor no vuelvas a jugar a este juego.");
        }


    }

    public static void comer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nES LA HORA DE COMER, ¿QUE PREFIERES?");
        System.out.println("1. Arroz con pollo");
        System.out.println("2. Ensalada de queso de cabra y nueces");
        System.out.println("3. Hamburguesa de KFC");
        System.out.println("4. Macarrones con queso");
        System.out.println("5. No tengo hambre, ayuno hasta la cena");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
            case 2:
                vida++;
                break;
            case 3:
                vida--;
                fuerza--;
                break;
            case 4:
                break;
            case 5:
                vida++;
                break;
            default:
                System.out.println("Introduce un valor válido");
        }
    }

    public static void cenar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nES LA HORA DE CENAR, ¿QUE PREFIERES?");
        System.out.println("1. Nada, hago ayuno hasta mañana");
        System.out.println("2. Ensalada");
        System.out.println("3. Dominozz Pizza");
        System.out.println("4. Sopa");
        System.out.println("5. Filete de pescado");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                vida++;
                break;
            case 2:
                vida++;
                break;
            case 3:
                vida -= 2;
                break;
            case 4:
                break;
            case 5:
                vida++;
            default:
                System.out.println("El valor introducido no es válido");
        }
    }

    public static void postre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPOSTRE, ¿QUE PREFIERES?");
        System.out.println("1. No tomo postre");
        System.out.println("2. Cafe");
        System.out.println("3. Tarta de queso");
        System.out.println("4. Té");
        System.out.println("5. Brazo de gitano");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                vida++;
                break;
            case 2:
                break;
            case 3:
                vida--;
                break;
            case 4:
                vida++;
                break;
            case 5:
                vida--;
                fuerza--;
                break;
            default:
                System.out.println("Introduce un valor válido");

        }
    }


    public static void ejercicio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nES HORA DE DECIDIR QUE HACES ESTA TARDE");
        System.out.println("1. Ver netflix");
        System.out.println("2. Ir al GYM");
        System.out.println("3. Ir a sar un paseo para ver el anochecer");
        System.out.println("4. Jugar a la play");
        System.out.println("5. Ir a la bolera con amigos");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                vida--;
                fuerza--;
                break;
            case 2:
                vida++;
                fuerza++;
                System.out.println("Al terminar el gym te duchas?");
                System.out.println("1. Por supuesto");
                System.out.println("2. A veces no");
                int ducharse = sc.nextInt();
                if (ducharse == 2) {
                    higiene -= 5;
                } else if (ducharse == 1) {
                    higiene++;
                } else {
                    System.out.println("El valor introducido no es válido");
                }
                break;
            case 3:
                vida++;
                break;
            case 4:
                vida--;
                fuerza--;
                break;
            default:
                System.out.println("El valor que has introducido no es valido");

        }
    }

    public static void eventoRandom() {
        Scanner sc = new Scanner(System.in);
        int opcion = (int) (Math.random() * 3);
        switch (opcion) {
            case 0:
                System.out.println("Vas al supermercado");
                System.out.println("1. Compras avena");
                System.out.println("2. Compras polvorones");
                int eleccion = sc.nextInt();
                if (eleccion == 1) {
                    vida++;
                } else if (eleccion == 2) {
                    vida--;
                }
                break;
            case 1:
                System.out.println("Vas de viaje");
                System.out.println("1. Durante las vacaciones no se hace ejercicio");
                System.out.println("2. Haces ejercicio en cuanto tienes un rato libre");
                int eleccion2 = sc.nextInt();
                if (eleccion2 == 2) {
                    fuerza++;
                } else if (eleccion2 == 1) {
                    fuerza--;
                }
            case 2:
                System.out.println("Sacas a pasear al perro");
                System.out.println("1. Vas andando");
                System.out.println("2. Vas corriendo");
                System.out.println("3. Lo dejas que se pasee solo");
                int eleccion3 = sc.nextInt();
                if (eleccion3 == 1) {
                    vida++;
                } else if (eleccion3 == 2) {
                    vida += 2;
                } else if (eleccion3 == 3) {
                    vida--;
                } else {
                    System.out.println("Introduce un valor correcto");
                }
        }
    }
}
