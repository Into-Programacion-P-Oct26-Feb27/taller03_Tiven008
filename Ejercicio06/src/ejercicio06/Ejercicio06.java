/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Tiven008
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 100;
        int variable2 = 4;
        int variable3 = 25;
        int variable4 = 7;
        int variable5 = 50;
        
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        boolean resultado = (variable1 / variable2 == variable3) && Math.pow(variable4, 2) > variable5;
        
        System.out.println(resultado);
        
    }
    
}
