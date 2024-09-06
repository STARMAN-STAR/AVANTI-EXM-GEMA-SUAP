/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import mx.desarrollo.entidad.Alumno_1;
import mx.desarrollo.integracion.ServiceLocator;
/**
 *
 * @author STARDUST
 */
public class DelegateAlumno {
  /**
     * Metodo de ejemplo para guardar Alumno
     * @param alumno de tipo usuario con id 0 para que se cree un id nuevo
     */
    public void saveAlumno(Alumno_1 alumno){
        ServiceLocator.getInstanceAlumnoDAO().save(alumno);
    }
}
