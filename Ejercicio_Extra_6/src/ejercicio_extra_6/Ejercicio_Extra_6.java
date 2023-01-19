/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra_6;

import ejercicio_extra_6.Entidades.Ahorcado;
import ejercicio_extra_6.Servicios.ahorcadoServicios;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Juego Ahorcado");
        ahorcadoServicios aS = new ahorcadoServicios();
        
        Ahorcado j1 = aS.crearJuego();
        
        aS.juego(j1); // Método Ejecutor
        
    }
    
}
