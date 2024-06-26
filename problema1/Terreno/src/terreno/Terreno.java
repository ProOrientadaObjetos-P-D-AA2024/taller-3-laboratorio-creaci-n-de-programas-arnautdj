/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terreno;

/**
 *
 * @author santy
 */
public class Terreno {
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    public void calcularArea() {
        area = ancho * largo;
    }
    
    public double getArea() {
        return area;
    }

    public void calcularCosto() {
        costoTerreno = area * valorMetroCuadrado;
    }
    
    public double getCostoTerreno(){
        return costoTerreno;
    }

}
