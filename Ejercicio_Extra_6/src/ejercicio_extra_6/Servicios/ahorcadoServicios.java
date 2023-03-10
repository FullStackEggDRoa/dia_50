/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_6.Servicios;

import ejercicio_extra_6.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class ahorcadoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        System.out.print("Ingrese una palabra: ");
        String palabra = leer.next();
       
        System.out.print("Ingrese la Cantidad de Jugadas Máxima: ");
        int cantidadJugadasMax=leer.nextInt();
        int longitudVector=palabra.length();
        char[] palabraBuscar= new char[longitudVector];
        for(int i=0;i<longitudVector;i++){
            palabraBuscar[i]=palabra.charAt(i);
        }
        
        return new Ahorcado(palabraBuscar,0,cantidadJugadasMax);
    }
    
    public void juego(Ahorcado juego){
        boolean bandera_aux=false;
        boolean encontrados[];
        System.out.println("Arranquemos....");
        do {    
            System.out.print("Ingrese una letra: ");
            char aux = leer.next().charAt(0);
            System.out.print("Mensaje:");
            bandera_aux=juego.buscar(aux);
            encontrados=juego.encontradas(aux);
            juego.intentos();
            juego.revelador(encontrados);
        } while (juego.getCantidadJugadasMax()>0 && !(juego.getLetrasEncontradas()==juego.getPalabraBuscar().length));
        String respuestaAux=Arrays.toString(juego.getPalabraBuscar());
        if(juego.getLetrasEncontradas()==juego.getPalabraBuscar().length){
            System.out.println("Encontraste la Palabra: "+respuestaAux.replace(",", ""));
        }else{
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
            System.out.println("Game Over :)");
            
            
            System.out.println("La Palabra Correcta es: "+respuestaAux.replace(",", ""));
        }
    }
    
    
}
