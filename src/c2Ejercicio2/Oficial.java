package c2Ejercicio2;

public class Oficial extends Operario{

    //Oficial(String empleado) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    //public Oficial() {
    //}

    public Oficial(String empleado) {
        super(empleado);
        System.out.println("Constructor de Oficial");                                                             
    }
   
    @Override
    public String toString() {
         String Oficial = "el empleado es ";
        Oficial += this.getNombre();
        return super.toString() + " -> Oficial";
    }
}