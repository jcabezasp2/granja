
/**
 * Write a description of class Granjero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granjero
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private Mascota mascota;

    /**
     * Constructor for objects of class Granjero
     */
    public Granjero(String nombre, String apellidos, int edad, char sexo)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        
        return nombre;
    }
    
    public String getApellidos()
    {
       
        return apellidos;
    }
    
    public int getEdad()
    {
        
        return edad;
    }
    
    public char getSexo()
    {
        // put your code here
        return sexo;
    }
    
    public void setNombre(String nombre)
    {
        
         this.nombre = nombre; 
    }
    
    public void setApellidos(String apellidos)
    {
       
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad)
    {
        
       this.edad = edad;
    }
    
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public String toString(){
        StringBuilder resultado = new StringBuilder();
       resultado.append( "\nNombre: ");
       resultado.append(nombre);
       resultado.append("\n Apellidos: ");
       resultado.append(apellidos);
       resultado.append("\n edad: ");
       resultado.append(edad);
       resultado.append("\n sexo: ");
       resultado.append(sexo);
       resultado.append(mascota);
    
         return resultado.toString();  
    }
}
