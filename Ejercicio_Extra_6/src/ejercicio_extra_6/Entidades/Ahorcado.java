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
    private boolean[] posiciones_acertadas;
    
    //Constructores

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscar, int letrasEncontradas, int cantidadJugadasMax) {
        this.palabraBuscar = palabraBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadasMax = cantidadJugadasMax;
        this.posiciones_acertadas = new boolean[palabraBuscar.length];
    }
    
    // Métodos

    public char[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getCantidadJugadasMax() {
        return cantidadJugadasMax;
    }
    
    
    
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
            System.out.println("La Letra pertenece a la palabra");
        }else{
            System.out.println("La Letra NO pertenece a la palabra");
        }
        
        return respuesta;
    }
    
    public boolean[] encontradas(char letra){
        int contador=0;
        
        //boolean respuesta=false;
        
        for(int i =0;i<palabraBuscar.length;i++){
            if(letra == palabraBuscar[i]){
                contador++;
                posiciones_acertadas[i]=true;
            }else{
                if(posiciones_acertadas[i]==true)
                {
                    
                }else{
                    posiciones_acertadas[i]=false;
                }   
            }
        }
        
        if(contador>0){
            letrasEncontradas+=contador;
            //respuesta=true;
            System.out.println("Número de letras (encontradas,faltantes): ("+letrasEncontradas+","+(palabraBuscar.length-letrasEncontradas)+")");
            //System.out.println("Han sido encontradas "+contador+" letras.");
            //System.out.println("Te faltan "+(palabraBuscar.length-contador)+" letras.");
            
        }else{
            cantidadJugadasMax--;
            //respuesta=false;
            System.out.println("Letra NO encontrada.\n"+"Te quedan "+cantidadJugadasMax+" Intentos."); 
        }
        
        return posiciones_acertadas;
    }
    
    public void intentos(){
        System.out.println("Número de oportunidades restantes: "+cantidadJugadasMax);
    }
    public void revelador(boolean[] revelador){
        System.out.println("Avance: ");
        for(int i=0;i<palabraBuscar.length;i++){
            if(revelador[i])
            {
                System.out.print(palabraBuscar[i]+" ");    
            }else
            {
                System.out.print("_ ");    
            }
            
        }
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return "Ahorcado{" + "palabraBuscar=" + palabraBuscar + ", letrasEncontradas=" + letrasEncontradas + ", cantidadJugadasMax=" + cantidadJugadasMax + '}';
    }
    
    
    
    
    
}
