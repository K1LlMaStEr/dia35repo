/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mao13y14;

import java.util.Scanner;

/**
 *
 * @author marib
 */
public class Mao13y14 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de compañeros: ");
        
        int companeros = entrada.nextInt();
                
        String[] equipo = new String[companeros];
        
        for(int i = 0; i < companeros; i++){
            System.out.println("Ingrese un nombre: ");
            equipo[i] = entrada.next();
        }
        
    }
    
}

    
    

