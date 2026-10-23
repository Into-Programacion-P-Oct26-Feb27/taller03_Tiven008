/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

/**
 *
 * @author Tiven008
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución del problema
        
        int variable1 = 3;
        int variable2 = 81;
        int variable3 = 40;
    
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        boolean resultado = Math.pow(variable1, 3) + Math.sqrt(variable2) <= variable3;

        System.out.println(resultado);
        
    }
    
}
