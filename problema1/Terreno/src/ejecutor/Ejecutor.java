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
        
        double ancho = 200;
        double largo = 180;
        double valorM2 = 1199;
        
        tierra.setAncho(ancho);
        tierra.setLargo(largo);
        tierra.setValorMetroCuadrado(valorM2);
        
        double area = tierra.calcularArea();
        double costoTerreno = tierra.getValorMetroCuadrado();
        
        System.out.println("Ancho: " + ancho + "m");
        System.out.println("Largo: " + largo + "m");
        System.out.println("Area: " + area + "m^2");
        System.out.println("Valor metro cuadrado: $" + valorM2);
        System.out.println("Costo total: $" + costoTerreno);
        
    }
    
    
    
}
