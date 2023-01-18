/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_6.Entidades;

/**
 *
 * @author droa
 */
public class Ahorcado {
    // Atributos
    private char[] palabraBuscar;
    private int letrasEncontradas;
    private int cantidadJugadasMax;
    
    //Constructores

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscar, int letrasEncontradas, int cantidadJugadasMax) {
        this.palabraBuscar = palabraBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadasMax = cantidadJugadasMax;
    }
    
    // Métodos
    public int longitud(){
        return palabraBuscar.length;
    }
    
    public boolean buscar(char letra){
        
        boolean respuesta=false;
        for(int i =0;i<palabraBuscar.length;i++){
            if(letra == palabraBuscar[i]){
                
                respuesta=true;
                break; 
            }else{
                respuesta=false;
            }
        }
        
        if(respuesta){
            System.out.println("Letra encontrada");
        }else{
            System.out.println("Letra NO encontrada");
        }
        
        return respuesta;
    }
    
    public boolean encontradas(char letra){
        int contador=0;
        boolean respuesta=false;
        
        for(int i =0;i<palabraBuscar.length;i++){
            if(letra == palabraBuscar[i]){
                contador++;
            }
        }
        
        if(contador>0){
            letrasEncontradas+=contador;
            respuesta=true;
            System.out.println("Han sido encontradas "+contador+" letras.");
            System.out.println("Te faltan "+(palabraBuscar.length-contador)+" letras.");
            
        }else{
            cantidadJugadasMax--;
            respuesta=false;
            System.out.println("Letra NO encontrada.\n"+"Te quedan "+cantidadJugadasMax+" Intentos."); 
        }
        
        return respuesta;
    }
    
    public void intentos(){
        System.out.println("Te quedan "+cantidadJugadasMax+" Intentos.");
    }
    
    @Override
    public String toString() {
        return "Ahorcado{" + "palabraBuscar=" + palabraBuscar + ", letrasEncontradas=" + letrasEncontradas + ", cantidadJugadasMax=" + cantidadJugadasMax + '}';
    }
    
    
    
    
    
}
