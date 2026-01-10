
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/attendance_db",
                "postgres",
                "hello2612"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
