/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author Tiven008
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución del problema
        
        int variable1 = 5;
        int variable2 = 3;
        int variable3 = 4;
        int variable4 = 7;
    
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        double resultado = (Math.pow(variable1, 2) + Math.pow(variable2, 3))/ variable3 + variable4;

        System.out.println(resultado);
        
    }
 
}
