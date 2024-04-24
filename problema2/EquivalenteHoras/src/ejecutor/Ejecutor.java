/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

/**
 *
 * @author santy
 */
import equivalentehoras.EquivalenteHoras;
public class Ejecutor {

    public static void main(String[] args) {
        
        EquivalenteHoras convert = new EquivalenteHoras();
        
        double horas = 8;
        
        convert.setHoras(horas);
        
        double minutos = convert.equivalenciaMinutos();
        double segundos = convert.equivalenciaSegundos();
        double dias = convert.equivalenciaDias();
        
        System.out.printf("Equivalencia de %.0f horas:\nMinutos: %.0f\n"
                + "Segundos: %.0f\nDias: %.2f\n\n",
                horas, minutos, segundos, dias);
        
        EquivalenteHoras convertDos = new EquivalenteHoras();
        
        double horas2 = 24;
        
        convertDos.setHoras(horas2);
        
        double minutos2 = convertDos.equivalenciaMinutos();
        double segundos2 = convertDos.equivalenciaSegundos();
        double dias2 = convertDos.equivalenciaDias();
        
        System.out.printf("Equivalencia de %.0f horas:\nMinutos: %.0f\n"
                + "Segundos: %.0f\nDias: %.2f\n\n",
                horas2, minutos2, segundos2, dias2);
        
    }
    
}
