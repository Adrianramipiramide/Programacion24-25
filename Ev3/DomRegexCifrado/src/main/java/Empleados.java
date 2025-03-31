public class Empleados {
    String id;
    String apellido;
    int dep;
    double salario;

    public Empleados(String id, String apellido, int dep, double salario) {
        this.id = id;
        this.apellido = apellido;
        this.dep = dep;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "id='" + id + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dep=" + dep +
                ", salario=" + salario +
                '}';
    }
}
