/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2Ejercicio2;

/**
 *
 * @author ericv
 */
public class Empleado {
    private String empleado;
    /*private String Operario;
    private String Oficial;
    private String Tecnico;*/
    private String OpcionMul;
    
    public Empleado(/*String Directivo, String Operario, String Oficial,*/ String Empleado, String OpcionMul){
        this.empleado = Empleado;
        /*this.Operario = Operario;
        this.Oficial = Oficial;
        this.Tecnico = Tecnico;*/
        this.OpcionMul = OpcionMul;
    }
    
     public String getEmpleado(){
        return empleado;
    }
    
    /*public String getOperario(){
        return Operario;
    }
    
    public String getOficial(){
        return Oficial;
    }
    
    public String getTecnico(){
        return Tecnico;
    }*/
    
    public String getOpcionMul(){
        return OpcionMul;
    }
    
    //public String toString(){
      //  if(OpcionMul == "Directivo"){
            
        //}
   // }
    
    public String toString(){
       if (OpcionMul == "Directivo"){
        return "Título: " + empleado +
                "Opcion " + OpcionMul;
       }
       if (OpcionMul == "Oficial") {
        return "Título: " + empleado +
                "Opcion " + OpcionMul;
       }
       if (OpcionMul == "Operario"){
           return "Título: " + empleado +
                "Opcion " + OpcionMul;
       }else{
           return "Título: " + empleado +
                "Opcion " + OpcionMul;
       }
    }
}