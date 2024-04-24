/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equivalentehoras;

/**
 *
 * @author santy
 */
public class EquivalenteHoras {
    
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double equivalenciaMinutos() {
        minutos = horas * 60;
        return minutos;
    }
    
    public double equivalenciaSegundos() {
        segundos = minutos * 60;
        return segundos;
    }
    
    public double equivalenciaDias() {
        dias = horas / 24;
        return dias;
    }
    
}
