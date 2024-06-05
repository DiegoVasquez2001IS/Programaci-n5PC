package C_Datos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import C_Logica.Contacto;
import javax.swing.JOptionPane;

public class ContactoDAO extends Conexion{
    
    private static final String SQL_INSERT="INSERT INTO contacto VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT="SELECT*FROM contacto";
    private static final String SQL_UPDATE="UPDATE contacto SET TelFijo=?, Celular=?, Correo=?, Direccion=?, Estatus=? WHERE ID=?";
    
    //Método para mostrar data
    public List<Contacto> mostrar_data(){
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet result_set = null;
        Contacto contacto = null;
        
        List<Contacto> contactos = new ArrayList();
        
        try{
            conexion = Conexion.getConnection();
            statement = conexion.prepareStatement(SQL_SELECT);
            result_set = statement.executeQuery();
            
            
            while(result_set.next()){
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
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            Conexion.close(result_set);
            Conexion.close(statement);
            Conexion.close(conexion);
        }
        return contactos;
    }
    
    //Método insertar datos
    
    public int insertar (Contacto contacto){
        Connection conexion=null;
        PreparedStatement statement=null;
        int rows=0;
        
        try{
            conexion=Conexion.getConnection();
            statement=conexion.prepareStatement(SQL_INSERT);
            statement.setInt(1, contacto.getID());
            statement.setString(2, contacto.getNombre());
            statement.setString(3, contacto.getApellido1());
            statement.setString(4, contacto.getApellido2());
            statement.setInt(5, contacto.getTelFijo());
            statement.setInt(6, contacto.getCelular());
            statement.setString(7, contacto.getCorreo());
            statement.setString(8, contacto.getDireccion());
            statement.setInt(9, contacto.getEstatus());
            System.out.println("Ejecutando consulta: "+SQL_INSERT);
            rows=statement.executeUpdate();
            System.out.println("Registros afectados: "+rows);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            Conexion.close(statement);
            Conexion.close(conexion);
        }
        return rows;
    }
    
    public int actualizar_info(Contacto contacto){
        Connection conexion=null;
        PreparedStatement statement=null;
        int rows=0;
        
        try{
            conexion=Conexion.getConnection();
            statement=conexion.prepareStatement(SQL_UPDATE);
            statement.setInt(1, contacto.getTelFijo());
            statement.setInt(2, contacto.getCelular());
            statement.setString(3, contacto.getCorreo());
            statement.setString(4, contacto.getDireccion());
            statement.setInt(5, contacto.getEstatus());
            statement.setInt(6, contacto.getID());
            rows=statement.executeUpdate();
            System.out.println("Registro actualizado");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            Conexion.close(statement);
            Conexion.close(conexion);
        }
        return rows;
    }
}
