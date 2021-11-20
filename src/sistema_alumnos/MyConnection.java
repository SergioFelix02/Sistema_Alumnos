package sistema_alumnos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

import javax.swing.JOptionPane;

public class MyConnection {
    //LoginUI Login = new LoginUI();
    //String user = Login.getUser();
    //String password = Login.getPassword();
    public static Connection getConnection() {
        String User = "";
        String Password = "";
        try {
            File File2 = new File("CredencialesSQL.txt");
            if (!File2.exists()) {
                System.out.println("Archivo -CredencialesSQL.txt- no existe");
            }
            FileReader File = new FileReader(File2);
            BufferedReader Buffer = new BufferedReader(File);
            User = Buffer.readLine();
            Password = Buffer.readLine();
            System.out.println(User);
            System.out.println(Password);
            File.close();
        }catch(IOException MM) {
            //System.out.println("Error: "+MM.getMessage());
        }
        String connectionUrl = "jdbc:sqlserver://localhost:1433;"
        + "database=bdSistema;"
        + "user=" + User +";"
        + "password=" + Password +";"
        + "loginTimeout=30;";
        try {
            Connection cn = DriverManager.getConnection(connectionUrl);
            return cn;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
