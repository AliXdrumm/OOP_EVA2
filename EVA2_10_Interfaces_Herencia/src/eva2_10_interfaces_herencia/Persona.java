package eva2_10_interfaces_herencia;

/**
 *
 * @author licce
 */
public class Persona {
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private int edad;
    
    public Persona(){
    this.nombre = "";
    this.ap_paterno = "";
    this.ap_materno = "";
    this.edad = 0;
    }
    
    public Persona(String nombre, String ap_paterno, String ap_materno, int edad){
        this.nombre = nombre;
    this.ap_paterno = ap_paterno;
    this.ap_materno = ap_materno;
    this.edad = edad;
    }
    
    public String getNombre(){
    return this.nombre; 
    }
    
    public void setNombre(String valor){
    this.nombre = valor;
    }
    
        public String getApPaterno(){
    return this.ap_paterno; 
    }
    
    public void setApPaterno(String valor){
    this.ap_paterno = valor;
    }
    
        public String getApMaterno(){
    return this.ap_materno; 
    }
    
    public void setApMaterno(String valor){
    this.ap_materno = valor;
    }
    
        public int getEdad(){
    return this.edad; 
    }
    
    public void setEdad(int valor){
    this.edad = valor;
    }

}
