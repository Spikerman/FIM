import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by chenhao on 3/24/16.
 */
public class DbController {
    public static final String url = "jdbc:mysql://127.0.0.1/Data";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "root";


    public Connection connection = null;


    public DbController() {
        try {
            Class.forName(name);
            connection = DriverManager.getConnection(url, user, password);
            //connection test
            System.out.println("Connect Database Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        DbController dbController = new DbController();
    }



}
