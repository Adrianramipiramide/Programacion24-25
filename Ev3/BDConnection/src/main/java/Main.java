import java.sql.*;

public class Main {
    public static void main(String[] args) {


        try {
            Connection conexion = DriverManager.getConnection("database-1.cpwoqsmqg94x.us-east-1.rds.amazonaws.com","admin","ARfed099");
            String consulta = "select * from Libros where id = 1";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            String nombre = resultSet.getString("titulo");
            System.out.println(nombre);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
