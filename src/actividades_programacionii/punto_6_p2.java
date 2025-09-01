package actividades_programacionii;

/* @author Victor */

import java.util.Scanner;

public class punto_6_p2 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float[][] notas = new float[3][3];
        float[] promEst = new float[3];
        float[] promAsi = new float[3];
        
        System.out.println("Ingrese las notas ");
        for(int col=1;col<=3;col++)
        {
            System.out.print("\nEstudiante #"+col+"\n");
            for (int fil=1;fil<=3;fil++)
            {
                System.out.print("Asignatura #"+fil);
                System.out.print("\nNota: "); notas[fil-1][col-1] = scan.nextFloat();
            }
        }
        
        for(int A=0;A<=2;A++)
        {
            promEst[A]=(notas[0][A]+notas[1][A]+notas[2][A])/3;
            promAsi[A]=(notas[A][0]+notas[A][1]+notas[A][2])/3;
        }
       
        System.out.println("\nPROMEDIOS DE ESTUDIANTES");
        for(int A=1;A<=3;A++)
        {
            System.out.println("Estudiante #"+ A +": "+promEst[A-1]);
        }
        System.out.println("\nPROMEDIOS DE ASIGNATURAS");
        for(int A=1;A<=3;A++)
        {
            System.out.println("Asignatura #"+ A +": "+promAsi[A-1]);
        }
        
    }
    
}
