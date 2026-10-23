/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author tiven
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 15;        
        int variable2 = 25;
        int variable3 = 30;
        int variable4 = 8;
        int variable5 = 60;
        int variable6 = 144;
        int variable7 = 12;
        
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        boolean resultado = (variable1 + variable2 > variable3) || 
                (Math.pow(variable4 ,2) < variable5) && (Math.sqrt(variable6) == variable7);
        
        System.out.println(resultado);
        
    }
    
}
