/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.lav3.p2;

/**
 *
 * @author Luiggi
 */
public class Ejercicio1Lab3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int prom;
        ClaseVector Cosechas = new ClaseVector(12);
        Cosechas.CargaVector();
        prom = Cosechas.obtenerPromedioAnual();
        System.out.println("El Promedio anual es:"+ prom);
        System.out.println("La cantidad de meses que superan el prom son:"+ Cosechas.obtenerCantMay(prom));
        System.out.println("La cantidad de meses que son menores el prom son:"+ Cosechas.obtenerCantMen(prom));
    }
}
