
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
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("escriba su nombre ");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        System.out.println("escribir su edad");
       // Scanner leer = new Scanner(System.in);
        int edad = leer.nextInt();
        
        System.out.println("mi nombre es " + nombre + " y mi edad es " + edad + " años ");
        System.out.print("hola");
        System.out.print(" ");
        System.out.print("mundo");
        
        
        
        // TODO code application logic here
    }
    
}
