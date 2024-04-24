/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

/**
 *
 * @author santy
 */
import celular.Celular;
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Celular celular = new Celular();
        
        String sistemaOperativo = "Android";
        String tamanoPantalla = "1080 x 2340";
        double costoInicial = 790;
        int porcIva = 15;
        double ivaInicial = 79;
        String dirMac = "22:3a:c7:2g:1D:4a";
        String infoIMEI = "482730582944829";
        
        celular.setSistemaOperativo(sistemaOperativo);
        celular.setTamanoPantalla(tamanoPantalla);
        celular.setCostoInicial(costoInicial);
        celular.setPorcIva(porcIva);
        celular.setIvaInicial(ivaInicial);
        celular.setDirMac(dirMac);
        celular.setInfoIMEI(infoIMEI);
        celular.setCostoFinal();
        
        System.out.printf("Datos del celular:\nSistema operativo: %s\nTamano "
                + "de pantalla: %s\nCosto inicial: %.2f\nPorcentaje de IVA: %d"
                + "\nCosto final: %.2f\n\n",
                celular.getSistemaOperativo(),
                celular.getTamanoPantalla(),
                celular.getCostoInicial(),
                celular.getPorcIva(),
                celular.getCostoFinal());
        
        Celular celularDos = new Celular();
        
        String sistemaOperativo2 = "iOS";
        String tamanoPantalla2 = "2532 x 1170";
        double costoInicial2 = 1190;
        int porcIva2 = 15;
        double ivaInicial2 = 110;
        String dirMac2 = "00:1E:C2:0A:1B:C3";
        String infoIMEI2 = "306000034567890";
        
        celularDos.setSistemaOperativo(sistemaOperativo2);
        celularDos.setTamanoPantalla(tamanoPantalla2);
        celularDos.setCostoInicial(costoInicial2);
        celularDos.setPorcIva(porcIva2);
        celularDos.setIvaInicial(ivaInicial2);
        celularDos.setDirMac(dirMac2);
        celularDos.setInfoIMEI(infoIMEI2);
        celularDos.setCostoFinal();
        
        System.out.printf("Datos del celular:\nSistema operativo: %s\nTamano "
                + "de pantalla: %s\nCosto inicial: %.2f\nPorcentaje de IVA: %d"
                + "\nCosto final: %.2f\n\n",
                celularDos.getSistemaOperativo(),
                celularDos.getTamanoPantalla(),
                celularDos.getCostoInicial(),
                celularDos.getPorcIva(),
                celularDos.getCostoFinal());
        
    }
    
}
