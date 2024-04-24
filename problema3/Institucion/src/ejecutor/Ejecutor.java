/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

/**
 *
 * @author santy
 */
import institucion.Institucion;
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Institucion institucion = new Institucion();
        String nombre = "San Gerardo";
        String tipoInstitucion = "Privada";
        int numAlumnos = 694;
        int numDocentes = 135;
        int numSedes = 2;
        double gastoAlumno = 455.5;

        institucion.setNombre(nombre);
        institucion.setTipoInstitucion(tipoInstitucion);
        institucion.setNumAlumnos(numAlumnos);
        institucion.setNumDocentes(numDocentes);
        institucion.setNumSedes(numSedes);
        institucion.setGastoAlumno(gastoAlumno);
        institucion.setPresupuesto(gastoAlumno);
        
        System.out.printf("Datos de la institucion 1:\nNombre de la institucion:"
                + " %s\nTipo de institucion: %s\nNumero de alumnos: %d\nNumero "
                + "de docentes: %d\nNumero de sedes: %d\nGasto proyectado por el"
                + " alumno: %.2f\nPresupuesto: %.2f\n\n",
                institucion.getNombre(),
                institucion.getTipoInstitucion(), 
                institucion.getNumAlumnos(), 
                institucion.getNumDocentes(), 
                institucion.getNumSedes(), 
                institucion.getGastoAlumno(), 
                institucion.getPresupuesto());
        
        Institucion institucionDos = new Institucion();
        String nombre2 = "Eugenio Espejo";
        String tipoInstitucion2 = "Privada";
        int numAlumnos2 = 799;
        int numDocentes2 = 120;
        int numSedes2 = 1;
        double gastoAlumno2 = 495;

        institucionDos.setNombre(nombre2);
        institucionDos.setTipoInstitucion(tipoInstitucion2);
        institucionDos.setNumAlumnos(numAlumnos2);
        institucionDos.setNumDocentes(numDocentes2);
        institucionDos.setNumSedes(numSedes2);
        institucionDos.setGastoAlumno(gastoAlumno2);
        institucionDos.setPresupuesto(gastoAlumno2);
        
        System.out.printf("Datos de la institucion 2:\nNombre de la institucion:"
                + " %s\nTipo de institucion: %s\nNumero de alumnos: %d\nNumero "
                + "de docentes: %d\nNumero de sedes: %d\nGasto proyectado por el"
                + " alumno: %.2f\nPresupuesto: %.2f\n\n",
                institucionDos.getNombre(),
                institucionDos.getTipoInstitucion(), 
                institucionDos.getNumAlumnos(), 
                institucionDos.getNumDocentes(), 
                institucionDos.getNumSedes(), 
                institucionDos.getGastoAlumno(), 
                institucionDos.getPresupuesto());
        
    }
    
}
