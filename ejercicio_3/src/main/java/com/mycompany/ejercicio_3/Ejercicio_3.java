/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_3;

/**
 *
 * @author aurin
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        
        //Variables
        int numero1;
        int numero2;
        int suma;
        int edad;
        String nombre;
        
        
        //Constante
        final int NUMERO_3= 4;
        
        
        //Ingreso los valores a la variables numero1 y numero 2
        numero1 = 30;
        numero2 = 40;
        
        
        //operacion suma
        suma = (numero1 + numero2);
        
       //Muestro en pantalla las dos variables y el resultado de la suma 
       System.out.println("Los valores de las variables son: ");
       System.out.println("Primer valor = " + numero1);
       System.out.println("Segundo valor = " + numero2);
       System.out.println("El resultado de la suma es:" + suma);
       
       //Cambio los valores de numero1,numero2 y vuelvo a realizar la operacion de suma
       numero1= 100;
       numero2= 68;
       
       
       //operacion suma
       suma = (numero1 + numero2);
       
       
       //Muestro en pantalla las dos variables y el resulatado de la suma
       
       System.out.println("Los nuevos valores de las variables son:");
       System.out.println("Primer valor = " + numero1);
       System.out.println("Segundo Valor = " + numero2);
       System.out.println(" El resultado de la suma es:" + suma
       );
       
       
       //Instancio y muestro en pantalla la variable nombre y su edad
       edad = 58;
       nombre = "Artigas";
       
       System.out.println("Nombre: " + nombre);
       System.out.println("Edad: " + edad);
       
       
       //Muestro en la pantalla la constante
       System.out.println("Constante= " + NUMERO_3);
       
       
              
       
       
       
              
               
       
       
       
      
    }   
}