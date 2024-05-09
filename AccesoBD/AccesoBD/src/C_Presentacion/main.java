package C_Presentacion;
import C_Datos.ContactoDAO;
import C_Logica.Contacto;
import java.util.List;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
       /*INSTANCIAS*/
       ContactoDAO data_contacto = new ContactoDAO();
       Contacto contacto = new Contacto();
       char next_var='s'; int option=0;
       
       while(next_var!='n'){
           System.out.println("1. Agregar data");
           System.out.println("2. Leer data");
           option=Integer.parseInt(JOptionPane.showInputDialog(null, "Opción"));
           
           switch(option){
               case 1:
                   contacto.setID(0);
                   contacto.setNombre(JOptionPane.showInputDialog(null, "Nombre"));
                   contacto.setApellido1(JOptionPane.showInputDialog(null, "Apellido 1"));
                   contacto.setApellido2(JOptionPane.showInputDialog(null, "Apellido 2"));
                   contacto.setTelFijo(Integer.parseInt(JOptionPane.showInputDialog(null, "Teléfono")));
                   contacto.setCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "Celular")));
                   contacto.setCorreo(JOptionPane.showInputDialog(null, "Correo"));
                   contacto.setDireccion(JOptionPane.showInputDialog(null, "Dirección"));
                   contacto.setEstatus(Integer.parseInt(JOptionPane.showInputDialog(null, "Estatus")));
                   if(contacto!=null){
                       if(data_contacto.insert(contacto)>0){
                           JOptionPane.showMessageDialog(null, "¡REGISTRO EXITOSO!");
                       }else{
                           JOptionPane.showMessageDialog(null,"¡ERROR!");
                       }
                   }
                   next_var=JOptionPane.showInputDialog(null, "¿Desea continuar? s/n").charAt(0);
                   break;
               case 2:
                   List<Contacto> lista_contacto = data_contacto.select();
                   for(int i=0; i<lista_contacto.size(); i++){
                       System.out.println("Registro: "+lista_contacto.get(i).getNombre() + "\t"+lista_contacto.get(i).getCelular());
                   }
                   next_var=JOptionPane.showInputDialog(null, "¿Desea continuar? s/n").charAt(0);
                   break;
               default:
                    
                    next_var=JOptionPane.showInputDialog(null, "¿Desea continuar? s/n").charAt(0);
                    break;
           }
       }
    }
}
