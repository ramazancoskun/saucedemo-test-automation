package utils;

import java.sql.*;

public class DBUtils {

    /**
     * Veritabanına bağlanır ve Connection nesnesi döner.
     */
    public static Connection getConnection(String url, String username, String password) {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.err.println("Veritabanına bağlanırken hata oluştu: " + e.getMessage());
            return null;
        }
    }

    /**
     * SELECT sorgusu çalıştırır ve ResultSet döner.
     */
    public static ResultSet executeQuery(Connection conn, String query) {
        try {
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("Query çalıştırılırken hata oluştu: " + e.getMessage());
            return null;
        }
    }

    /**
     * INSERT, UPDATE veya DELETE sorgularını çalıştırır.
     */
    public static int executeUpdate(Connection conn, String query) {
        try {
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("Update çalıştırılırken hata oluştu: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Veritabanı bağlantısını kapatır.
     */
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Connection kapatılırken hata oluştu: " + e.getMessage());
        }
    }
}
