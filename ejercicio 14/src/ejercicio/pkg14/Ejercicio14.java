/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;

import java.util.Scanner;

/**
 *
 * @author marib
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

        Scanner leer = new Scanner(System.in);

        double euro = 0;

        String moneda = "";

        System.out.println("Selecione el tipo de moneda");
        System.out.println("libras");
        System.out.println("dolares");
        System.out.println("yenes");
        moneda = leer.nextLine();
        System.out.println("Ingrese la cantidad de EUROS");
        euro = leer.nextDouble();

        switch (moneda) {
            case "libras":

                double valor = 0.86;
                double retorno = cambio(euro, valor);
                System.out.println("El tipo de cambio de Euro a " + moneda + " es igual a " + retorno);
                break;

            case "dolares":
                valor = 1.28611;
                retorno = cambio(euro, valor);
                System.out.println("El tipo de cambio de Euro a " + moneda + " es igual a " + retorno);
                break;

            case "yenes":
                valor = 129.852;
                retorno = cambio(euro, valor);
                System.out.println("El tipo de cambio de Euro a " + moneda + " es igual a " + retorno);
                break;

        }

    }

    public static double cambio(double euro, double valor) {
        double cambio;
        cambio = euro * valor;
        return cambio;
    }
}
