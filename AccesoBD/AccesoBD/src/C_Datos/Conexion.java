package C_Datos;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mysql://localhost/directorio";
    private static final String USER="root";
    private static final String PASS="";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    public static void close(ResultSet rs){
        try{
            rs.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void close(PreparedStatement st){
        try{
            st.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void close(Connection con){
        try{
            con.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}