
package actividades_programacionii;

/*@author Victor */

import java.util.Scanner;

public class punto_4_p2 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num,cont=1;
        
        System.out.println("Ingrese el numero: "); num = scan.nextInt();
        
            while(cont<=5)
            {
                System.out.println(num + " X " + cont + " = " + num*cont);
                cont++;
            }
        
        
    }
    
}
