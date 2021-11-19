
package sistema_alumnos;

import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection {
    LoginUI Login = new LoginUI();
    String user = Login.getUser();
    String password = Login.getPassword();
    public static Connection getConnection() {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            + "database=bdSistema;"
            + "user=SA;"
            + "password=Safp270602;"
            + "loginTimeout=30;";
        try {
            Connection cn = DriverManager.getConnection(connectionUrl);
            return cn;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            //System.out.println(e.toString());
            return null;
        }
    }
}
