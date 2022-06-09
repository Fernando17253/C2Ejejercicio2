package c2Ejercicio2;

public class Directivo extends C2Ejercicio2{

   /* public Directivo() {
    }*/
   
    
    
    public Directivo(String empleado) {
        super(empleado);
        System.out.println("Constructor de Directivo");                                                           
    }
   
    @Override
    public String toString() {
            
            String Directivo = "el empleado es ";
        Directivo += this.getNombre();
        //return super.toString() + "\n" + directivo;
            
        return super.toString() + " -> Directivo";
    }
}
