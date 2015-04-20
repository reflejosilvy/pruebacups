/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.lav3.p2;
import java.util.Scanner;

/**
 *
 * @author Luiggi
 */
public class ClaseVector 
{
private int toneladames[];
private int dimension;

    public ClaseVector(int elementos) 
    {
        dimension = elementos;
        toneladames = new int[dimension];
        
    }

    public int getDimension() 
    {
        return dimension;
    }

    public void setDimension(int dimension) 
    {
        this.dimension = dimension;
    }

   public void setToneladas(int pos,int toneladas)
   {
       this.toneladames[pos] = toneladas;
   }
   
   public int getToneladas(int pos)
   {
       return this.toneladames[pos];
   }
    
    public int obtenerCantMay(int prom)
    {
     int i = 0;
     int cant = 0;
     while (i < this.dimension)
     {
         if (this.toneladames[i] > prom)
         {
             cant++;
         }
         i++;
     }
     return cant;   
    }
    
    public int obtenerCantMen(int prom)
    {
     int i = 0;
     int cant = 0;
     while (i < this.dimension)
     {
         if (this.toneladames[i] < prom)
         {
             cant++;
         }
         i++;
     }
     return cant;   
    }
    
    public int obtenerPromedioAnual()
    {
     int i = 0;
     int sum = 0;
     int prom = 0;
     while (i < this.dimension)
     {
         sum = sum + this.toneladames[i];
         i++;
     }
     
     return prom = sum/this.dimension;   
    }

public void CargaVector()
{
    int i = 0;
    Scanner ing;
    int toneladas;
    while (i< this.dimension)
    {
        System.out.println("Ingrese el " + i + " eleme]nto:");
        
        ing = new Scanner(System.in);
        toneladas = ing.nextInt();
        this.setToneladas(i,toneladas);
        i++;
    }
}


}
