
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{
    // instance variables - replace the example below with your own
    private Granjero granjero;
    private String nombre;
    private String ubicacion;

    /**
     * Constructor for objects of class Granja
     */
    public Granja( Granjero propietario)
    {
        granjero = propietario;
    }
    
    public Granja (String nombre, String ubicacion, Granjero granjero){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        StringBuilder resultado = new StringBuilder();
        
        resultado.append( "\n Datos de la granja");
        resultado.append( "\n===================");
        resultado.append( "\nNombre: ");
        resultado.append(nombre);
        resultado.append( "\nUbicacion: "); 
        resultado.append(ubicacion);
        resultado.append( "\nGranjero: ");
        resultado.append(granjero);
        return resultado.toString();
    }
}
