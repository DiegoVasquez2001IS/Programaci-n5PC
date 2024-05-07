
package C_Logica;

public class Contacto {

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido1
     */
    public String getApellido1() {
        return Apellido1;
    }

    /**
     * @param Apellido1 the Apellido1 to set
     */
    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    /**
     * @return the Apellido2
     */
    public String getApellido2() {
        return Apellido2;
    }

    /**
     * @param Apellido2 the Apellido2 to set
     */
    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    /**
     * @return the TelFijo
     */
    public int getTelFijo() {
        return TelFijo;
    }

    /**
     * @param TelFijo the TelFijo to set
     */
    public void setTelFijo(int TelFijo) {
        this.TelFijo = TelFijo;
    }

    /**
     * @return the Celular
     */
    public int getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Estatus
     */
    public int getEstatus() {
        return Estatus;
    }

    /**
     * @param Estatus the Estatus to set
     */
    public void setEstatus(int Estatus) {
        this.Estatus = Estatus;
    }
    
    private int ID=0;
    private String Nombre="";
    private String Apellido1="";
    private String Apellido2="";
    private int TelFijo=0;
    private int Celular=0;
    private String Correo="";
    private String Direccion="";
    private int Estatus=0;
}
