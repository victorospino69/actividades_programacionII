package actividades_programacionii;

/* @author Victor */

import java.util.Scanner;

public class punto_5_p2 {
    
    public static float CalcularArea(float base,float altura){
        return base*altura;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float base,altura,area;
        
        System.out.println("Ingrese la altura:"); altura = scan.nextFloat();
        System.out.println("Ingrese la base:"); base = scan.nextFloat();
        
        area = CalcularArea(base, altura);
        
        System.out.println("El area del rectangulo altura "+ altura +"M y base "+ base +"M es: "+ area +"M^2");
    }
    
}
