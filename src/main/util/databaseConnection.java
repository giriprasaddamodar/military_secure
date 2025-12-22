public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/security_hub_db",
                "root",
                "password"
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
