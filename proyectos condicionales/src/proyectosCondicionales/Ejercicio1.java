/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosCondicionales;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia a pagado 3 cuotas de navidad de sus hijos, la cuota 1 
 * fue de 15 dolares , la cuota 2 de 10 dolares y la cuota 3 de 16 dolares
 * generar un programa en lenguaje java que permita ingresar por teclado los
 * valores de las cuotas, luego presentar el promedio de dolares pagados entre
 * las cuotas, ademas presentar un mensaje en pantalla(true or false)
 * dependiendo del promedio, si el promedio es mayor o igal a 11 deberia salir
 * true, si el promedio es menor a 11 deberia salir false
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int uno;
        int dos;
        int tres;
        int promedio;
        
        
        System.out.println("Ingrese el valor de la primera cuota");
        uno = entrada.nextInt();
        System.out.println("Ingresar el valor de la segunda cuota");
        dos = entrada.nextInt();
        System.out.println("Ingresar el valor de la tercera cuota");
        tres = entrada.nextInt();
        
        promedio = (uno + dos + tres)/3;
        
        
        System.out.printf("El promedio es: %d\n" + "promedio es: %s\n", 
                promedio, promedio >=11);
        
        
        
        
   
    }
}