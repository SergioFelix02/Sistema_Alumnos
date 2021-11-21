package sistema_alumnos;
import javax.swing.JOptionPane;
import java.sql.*;

public class Sistema_Alumnos {
    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    boolean foundA = false;
    boolean foundC = false;
    String nombre = "";
    int campus_id = 0;
    int estatus = 0;
    public static AlumnosUI princ = new AlumnosUI();
    
    public static void main(String[] args) {
        //LoginUI Login = new LoginUI();
        //Login.setVisible(true);
        princ.setVisible(true);
        princ.CrearTabla();
    }

    public boolean isFoundA() {
        return foundA;
    }

    public boolean isFoundC() {
        return foundC;
    }

    public void Insertar(String nombre, int campus_id, int estatus) {
        try {
            CallableStatement cst = cn.prepareCall("{call AlumnosInsertar(?,?,?)}");
            cst.setString(1, nombre);
            cst.setInt(2, campus_id);
            cst.setInt(3, estatus);
            cst.execute();
            //rs = cst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        princ.CrearTabla();
    }

    public void Modificar(int id_alumno, String nombre, int campus_id, int estatus) {
        try {
            CallableStatement cst = cn.prepareCall("{call AlumnosActualizar(?,?,?,?)}");
            cst.setInt(1, id_alumno);
            cst.setString(2, nombre);
            cst.setInt(3, campus_id);
            cst.setInt(4, estatus);
            cst.execute();
            //rs = cst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        princ.CrearTabla();
    }

    public void Desactivar(int id_alumno) {
        try {
            CallableStatement cst = cn.prepareCall("{call AlumnosDesactivar(?)}");
            cst.setInt(1, id_alumno);
            cst.execute();
            //rs = cst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        princ.CrearTabla();
    }

    public void InsertarC(String nombre) {
        try {
            CallableStatement cst = cn.prepareCall("{call CampusInsertar(?)}");
            cst.setString(1, nombre);
            cst.execute();
            //rs = cst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        princ.CrearTabla();
    }
    
    public void BuscarA(int id) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Alumnos where id = ?");
            pst.setInt(1, id);
            //pst.execute();
            rs = pst.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("nombre");
                campus_id = rs.getInt("campusId");
                estatus = rs.getInt("estatus");
                foundA = true;
            } else {
                foundA = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        princ.CrearTabla();
    }
    
    public void BuscarC(int id) {
        String nombre = "";
        int campus_id = 0;
        System.out.println(nombre + campus_id);
        try {
            PreparedStatement pst = cn.prepareStatement("select * from Campus where id = ?");
            pst.setInt(1, id);
            //pst.execute();
            rs = pst.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("nombre");
                campus_id = rs.getInt("id");
                foundC = true;
            } else {
                foundC = false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        princ.CrearTabla();
    }
    public String getNombre() {
        return nombre;
    }

    public int getCampus_id() {
        return campus_id;
    }

    public int getEstatus() {
        return estatus;
    }
}