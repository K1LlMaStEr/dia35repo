
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marib
 */
public class mao12a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ingrese dos numeros ");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);        
        
        
        
  
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.*/

        
        
        
    }
    public static void EsMultiplo(int num1, int num2) {
    
        if(0 == (num1% num2) ){
        System.out.println(" el " + num1 + " es multiplo de " + num2 );
        }else { System.out.println("no son multiplos"); 
 
        }
}
}