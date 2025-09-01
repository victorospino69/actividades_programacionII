
package actividades_programacionii;

import java.util.Scanner;

/* @author Victor */
public class punto_2_p2 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        short opcion;
        
            do{
                System.out.println("DIAS DE LA SEMANA.");
                System.out.print("Ingresa un dia de la semana: "); opcion = scan.nextShort();

                if (opcion < 1||opcion>7) {
                    System.out.println("Error: EL numero ingresado no es valido\n\n");
                }
            }while (opcion < 1||opcion>7);
            
            System.out.println("\n");
            
            switch(opcion)
            {
                case 1 -> System.out.println("Hoy es lunes, dia de semana");
                case 2 -> System.out.println("Hoy es martes, dia de semana");
                case 3 -> System.out.println("Hoy es miercoles, dia de semana");
                case 4 -> System.out.println("Hoy es jueves, dia de semana");
                case 5 -> System.out.println("Hoy es viernes, dia de semana");
                case 6 -> System.out.println("Hoy es sabado, fin de semana");
                case 7 -> System.out.println("Hoy es domingo, fin de semana");
            }
    }
}
