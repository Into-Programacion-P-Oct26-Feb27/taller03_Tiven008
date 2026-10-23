/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author tiven
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variable1 = 80;
        int variable2 = 40;
        int variable3 = 6;
        int variable4 = 5;
        int variable5 = 45;
        int variable6 = 100;
        int variable7 = 25;
        int variable8 = 3;
        int variable9 = 30;
        
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        // Math.pow se usa en algun numero con exponente
        
        boolean resultado = (variable1 + variable2 / variable3 + Math.pow(variable4 , 2) >= variable5) && (variable6 - variable7 * variable8 < variable9);
        
        System.out.println(resultado);
        
    }
    
}
