import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escribe un programa que pida un número de teléfono fijo por teclado. Si el número de teléfono empieza por 974
indicará "teléfono de Huesca". Si lo hace por 976 "teléfono de Zaragoza". Si lo hace por 978 "teléfono de Teruel".
 Si no, indicará "el teléfono no es de aragón". Utilizar switch-case, y el control de excepciones por si hay errores.

 */
public class telefonoPrefijos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del telefono: ");

        try{
            int numTelefono = sc.nextInt();
            int prefijo = numTelefono/1000000;


            if(numTelefono > 999999999 ||numTelefono<111111111){
                System.out.println("Introduzca un número correcto");
            }else {

                switch (prefijo) {
                    case 974:
                        System.out.println("El teléfono es de Huesca");
                        break;
                    case 976:
                        System.out.println("El teléfono es de Zaragoza");
                        break;
                    case 978:
                        System.out.println("El teléfono es de Teruel");
                        break;
                    default:
                        System.out.println("El telefono no es de Aragon");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Ha ocurrido un error");
            e.getMessage();

        }
    }
}
