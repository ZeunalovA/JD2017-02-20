package by.it.Zyryanov.jd03_01;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class C_Init {
    public static void create() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection =
                        DriverManager.getConnection(CN.URL_DB, CN.USER_DB, CN.PASSWORD_DB);
        ) {

            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE DATABASE testDB");
            System.out.println("БД успешно создана");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
