/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author Tiven008
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1 = 25;
        int variable2 = 15;
        int variable3 = 8;
        int variable4 = 49;
        double variable5 = 2.5;

        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número

        double resultado = (variable1 + variable2) / (double) variable3 + Math.sqrt(variable4) + variable5;

        System.out.println(resultado);
        
    }
    
}
