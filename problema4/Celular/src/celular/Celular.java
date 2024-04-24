/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celular;

/**
 *
 * @author santy
 */
public class Celular {
    
    private String sistemaOperativo;
    private String tamanoPantalla;
    private double costoInicial;
    private int porcIva;
    private double ivaInicial;
    private String dirMac;
    private String infoIMEI;
    private double costoFinal;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(String tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public int getPorcIva() {
        return porcIva;
    }

    public void setPorcIva(int porcIva) {
        this.porcIva = porcIva;
    }

    public double getIvaInicial() {
        return ivaInicial;
    }

    public void setIvaInicial(double ivaInicial) {
        this.ivaInicial = ivaInicial;
    }

    public String getDirMac() {
        return dirMac;
    }

    public void setDirMac(String dirMac) {
        this.dirMac = dirMac;
    }

    public String getInfoIMEI() {
        return infoIMEI;
    }

    public void setInfoIMEI(String infoIMEI) {
        this.infoIMEI = infoIMEI;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal() {
        costoFinal = costoInicial + ivaInicial;;
    }
    
    
}
