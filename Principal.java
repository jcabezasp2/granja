
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    // instance variables - replace the example below with your own
    public static void main() {
        Granjero paco = new Granjero("Paco", "Martinez", 58, 'H');
        Granja granjaDePaco = new Granja("pacolandiea", "Asturias", paco);
        Mascota mascota = new Mascota("Rex", 13, "Perro");
        paco.setMascota(mascota);
        System.out.println(granjaDePaco);
        
        
        
    }

    
    
}
