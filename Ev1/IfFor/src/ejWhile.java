//Muestra los números del 320 al 160 contando de 20 en 20 haciar atras con do while
public class ejWhile {
    public static void main(String[] args) {
        int num =360;
       do {
            System.out.println(num);
             num -=20;
        } while (num>=160);

        System.out.println("\nHaciendo el While \n");

       int num2 = 0;

       while (num2<=320){
           System.out.println(num2);
           num2 +=20;
        }
    }
}
