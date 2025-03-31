/*
Crea una aplicación que almacene como objetos en un fichero clientes.dat los datos básicos de los clientes como son el nombre completo (String),
teléfono (String), dirección (String), nif (String) y moroso (boolean). La aplicación debe contar con los siguientes métodos:
- Uno para introducir en el fichero anterior los datos de los clientes que se pedirán por teclado y se irán añadiendo al fichero.

- Uno para visualizar los datos que contiene el fichero.

- Uno que saque el listado de clientes morosos.

Cada vez que se ejecute el programa, el contenido del fichero se cargará en la aplicación.

 */

import java.io.*;
import java.util.ArrayList;

public class ej11 {


    public static class cliente implements Serializable{
        String nombre;
        String telefono;
        String nif;
        String direccion;
        boolean moroso;

        public cliente(String nombre, String telefono, String nif, String direccion, boolean moroso) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.nif = nif;
            this.direccion = direccion;
            this.moroso = moroso;
        }

        @Override
        public String toString() {
            return "cliente{" +
                    "nombre='" + nombre + '\'' +
                    '}';
        }
    }

    public static ArrayList<cliente> crearListaMorosos(ArrayList<cliente> listaM){
        ArrayList<cliente> listaMorosos = new ArrayList<>();
        for (int i = 0; i < listaM.size(); i++) {
            if(listaM.get(i).moroso == true){
                listaMorosos.add(listaM.get(i));
            }
        }
        System.out.println(listaMorosos);
        return listaMorosos;
    }

    public static void leerFicheroDatos(){

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/datos.dat"))){
            ArrayList<cliente> clientesLectura = new ArrayList<>();

            clientesLectura= (ArrayList<cliente>) ois.readObject();
            for(cliente  Cliente :clientesLectura){
                System.out.println(Cliente);
            }

        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        ArrayList<cliente> listaM= new ArrayList<>();
        cliente cliente1 = new cliente("Juan", "2313898","345245F", "C/Joaquin Costa", false);
        cliente cliente2 = new cliente("Pedro", "1234123","345245B", "C/Juan de la nuza", true);
        cliente cliente3 = new cliente("Pablo", "4353453","1237998U", "C/Juan de la nuza", true);

        listaM.add(cliente1);
        listaM.add(cliente2);
        listaM.add(cliente3);

        crearListaMorosos(listaM);

     try(DataOutputStream dts = new DataOutputStream(new FileOutputStream("/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/datos.dat",true))){

        dts.writeUTF(cliente1.direccion+ cliente1.nif);

     }catch(IOException e){
         e.printStackTrace();
     }
    }
}
