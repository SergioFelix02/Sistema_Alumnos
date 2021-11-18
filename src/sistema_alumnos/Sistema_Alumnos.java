
package sistema_alumnos;
import javax.swing.JOptionPane;
import java.sql.*;

public class Sistema_Alumnos extends MyConnection{
    ResultSet rs;
    Connection cn = MyConnection.getConnection();
    boolean foundA = false;
    boolean foundC = false;

    public boolean isFoundA() {
        return foundA;
    }
    
    public boolean isFoundC() {
        return foundC;
    }
    public static void main(String[] args) {
        LoginUI Login = new LoginUI();
        Login.show();
    }
    public void Insertar(String nombre, int campus_id, int estatus){
        try{
            CallableStatement cst = cn.prepareCall("{call AlumnosInsertar(?,?,?)}");
            cst.setString(1, nombre);
            cst.setInt(2, campus_id);
            cst.setInt(3, estatus);
            rs = cst.executeQuery();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Modificar(int id_alumno, String nombre, int campus_id, int estatus){
        try{
            CallableStatement cst = cn.prepareCall("{call AlumnosActualizar(?,?,?,?)}");
            cst.setInt(1, id_alumno);
            cst.setString(2, nombre);
            cst.setInt(3, campus_id);
            cst.setInt(4, estatus);
            rs = cst.executeQuery();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Desactivar(int id_alumno){
      try{
            CallableStatement cst = cn.prepareCall("{call AlumnosDesactivar(?)}");
            cst.setInt(1, id_alumno);
            rs = cst.executeQuery();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void InsertarC(String nombre){
      try{
            CallableStatement cst = cn.prepareCall("{call CampusInsertar(?)}");
            cst.setString(1, nombre);
            rs = cst.executeQuery();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    public void BuscarA(int id){
        String nombre = "";
        int campus_id = 0;
        int estatus = 0;
        try{
            PreparedStatement pst = cn.prepareStatement("select * from Alumnos where id = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()){
                nombre = rs.getString("nombre");
                campus_id = rs.getInt("campusId");
                estatus = rs.getInt("estatus");
                foundA = true;
            }else{
                foundA = false;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    public void BuscarC(int id){
        String nombre = "";
        int campus_id = 0;
        try{
            PreparedStatement pst = cn.prepareStatement("select * from Campus where id = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()){
                nombre = rs.getString("nombre");
                campus_id = rs.getInt("id");
                foundC = true;
            }else{
                foundC = false;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }    
    
}
