import java.sql.*;

public class Main {
    public static void main(String[] args) {


        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://database-1.cpwoqsmqg94x.us-east-1.rds.amazonaws.com/SAMPLE","admin","ARfed099");
            String consulta = "select * from Libros where id = 1";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            if (resultSet.next()) {
                String nombre = resultSet.getString("titulo");
                System.out.println(nombre);
            } else {
                System.out.println("No se encontró el libro con id = 1");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
