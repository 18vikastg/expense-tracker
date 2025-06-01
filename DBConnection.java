//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/expense_tracker?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "vedaraj@2004";

    public DBConnection() {
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/expense_tracker?serverTimezone=UTC", "root", "vedaraj@2004");
        } catch (SQLException var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ MySQL connection successful!");
            } else {
                System.out.println("❌ MySQL connection failed.");
            }
        } catch (Exception var2) {
            System.out.println("❌ Connection error: " + var2.getMessage());
            var2.printStackTrace();
        }

    }
}
