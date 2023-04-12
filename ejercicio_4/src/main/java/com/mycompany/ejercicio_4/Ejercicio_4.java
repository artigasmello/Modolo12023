/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

/**
 *
 * @author aurin
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        //Asignacion variables
        int N;
        double A;
        char C;
        double suma;
        double resta;
        
        //Declaramos la variable tipo int para valor ASCII de C
        int Ascii;
        
        // Ingreso los valores de las variables
        N = 20;
        A = 8.5;
        C = 'a';
        //Valor numerico de a
        Ascii = (int) + C;
        
        //Operacion suma y resta
        suma = (N + A);
        resta = (A - N);
        
        //Muestro en pantalla los valores de las variables, las operaciones y resultados
        System.out.println ("Variable N = " + N);
        System.out.println ("Variable A = " + A);
        System.out.println ("Variable C = " + C);
        System.out.println (N + " + " + A +" = "+ suma);
        System.out.println (A + " - " + N + " = " + resta);
        System.out.println ("Valor numerico del caracter C = " +Ascii);
    }
}
