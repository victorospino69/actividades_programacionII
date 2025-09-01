
package actividades_programacionii;

/* @author Victor */

import java.util.Scanner;

public class punto_3_p2 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int div,sumat=0;
        
        System.out.println("Ingrese el numero: ");div = scan.nextInt();
        System.out.println("\n\nLos divisores de "+ div +" son:");
            
            for (int i=1;i<=div;i++)
            {
                if (div % i == 0)
                {
                    sumat++;
                    System.out.print(" | "+ i +" | ");
                }
            }
        
        System.out.println("Tiene "+ sumat +" divisores");
    }
}
