/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2Ejercicio2;

/**
 *
 * @author ericv
 */
public class Lista {

    void add(Oficial oficial){
        
    }
    
    void add(Directivo directivo){
        
    }
    
    void add(Operario operario){
        
    }
    
    void add(Tecnico tecnico){
        
    }
    
    private Empleado[] lista;
    private int contador;
    
    public Lista(int tamañoMaximo){
        lista = new Empleado[tamañoMaximo];
        contador = 0;
    }
    
    public int size(){
        return contador;
    }
    
    private boolean llena(){
        return contador == lista.length;
    }
    
    public boolean add(Empleado m){
        if (llena()){
            return false;
        }else{
            lista[contador] = m;
            contador++;
            return true;
        }
    }
        
    public String toString(){
        String s="";
        for(int i=0; i<contador; i++){
            s += lista[i].toString() + "\n\n";
        }
        return s;
    }
   
}
