package c2Ejercicio2;

public class Tecnico extends Operario{

    /*public Tecnico() {
    }*/
    
    

    public Tecnico(String empleado) {
        super(empleado);
        System.out.println("Constructor de Técnico");                                                             
    }
   
    @Override
    public String toString() {
         String Tecnico = "el empleado es ";
        Tecnico += this.getNombre();
        return super.toString() + " -> Técnico";
    }
}