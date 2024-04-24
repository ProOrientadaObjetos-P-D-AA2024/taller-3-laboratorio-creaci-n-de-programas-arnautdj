/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

/**
 *
 * @author santy
 */
import terreno.Terreno;
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Terreno tierra = new Terreno();
        
        double ancho = 30;
        double largo = 45;
        double valorM2 = 1199;
        
        tierra.setAncho(ancho);
        tierra.setLargo(largo);
        tierra.setValorMetroCuadrado(valorM2);
        
        tierra.calcularArea();
        tierra.calcularCosto();
        
        double area = tierra.getArea();
        double costoTerreno = tierra.getCostoTerreno();
        
        System.out.printf("Los datos del terreno 1 son:\nAncho: %.2f m\nLargo:"
                + " %.2f m\nArea: %.2f m^2\nValor metro cuadrado: $%.2f\nCosto "
                + "total: $%.2f\n\n",
                ancho, largo, area, valorM2, costoTerreno);


        
        Terreno tierraDos = new Terreno();
        
        double ancho2 = 30;
        double largo2 = 320;
        double valorM22 = 980;
        
        tierraDos.setAncho(ancho2);
        tierraDos.setLargo(largo2);
        tierraDos.setValorMetroCuadrado(valorM22);
        
        tierraDos.calcularArea();
        tierraDos.calcularCosto();
        
        double area2 = tierraDos.getArea();
        double costoTerreno2 = tierraDos.getCostoTerreno();
        
        System.out.printf("Los datos del terreno 2 son:\nAncho: %.2f m\nLargo:"
                + " %.2f m\nArea: %.2f m^2\nValor metro cuadrado: $%.2f\nCosto "
                + "total: $%.2f\n\n",
                ancho2, largo2, area2, valorM22, costoTerreno2);
        
    }
    
    
    
}
