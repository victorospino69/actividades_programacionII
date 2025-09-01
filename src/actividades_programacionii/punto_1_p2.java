/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades_programacionii;
/* @author Victor */

import java.util.Scanner;

public class punto_1_p2 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int edad,dobleEdad;
        String nombre;
        double salBasico,salAnual; 
        
        System.out.println("Ingrese su nombre: "); nombre = scan.nextLine();
        System.out.println("Ingrese su edad: "); edad = scan.nextInt();
        System.out.println("Ingrese su salario basico: "); salBasico = scan.nextDouble();
        
        dobleEdad = edad * 2;
        salAnual = salBasico *12;
        
        System.out.println("\n______RESULTADO______");
        System.out.println(nombre + " tu salario anual es: " + salAnual);
        System.out.println("El doble de tu edad es: " + dobleEdad);
                
        scan.close();
    }
}
