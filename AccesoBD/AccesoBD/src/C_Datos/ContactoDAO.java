package C_Datos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import C_Logica.Contacto;
import javax.swing.JOptionPane;

public class ContactoDAO extends Conexion{
    
    private static final String SQL_INSERT="INSERT INTO contacto VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT="SELECT*FROM contacto";
    
    //Método para mostrar data
    public List<Contacto> select(){
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet result_set = null;
        Contacto contacto = null;
        
        List<Contacto> contactos = new ArrayList();
        
        try{
            conexion = Conexion.getConnection();
            statement = conexion.prepareStatement(SQL_SELECT);
            result_set = statement.executeQuery();
            contacto = new Contacto();
            contacto.setID(result_set.getInt(1));
            contacto.setNombre(result_set.getString(2));
            contacto.setApellido1(result_set.getString(3));
            contacto.setApellido2(result_set.getString(4));
            contacto.setTelFijo(result_set.getInt(5));
            contacto.setCelular(result_set.getInt(6));
            contacto.setCorreo(result_set.getString(7));
            contacto.setDireccion(result_set.getString(8));
            contacto.setEstatus(result_set.getInt(9));
            contactos.add(contacto);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            Conexion.close(result_set);
            Conexion.close(statement);
            Conexion.close(conexion);
        }
        return contactos;
    }
    
}
