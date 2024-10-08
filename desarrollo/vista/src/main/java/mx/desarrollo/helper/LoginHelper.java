/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.helper;

import java.io.Serializable;
import mx.desarrollo.entidad.Administrator;
import mx.desarrollo.entidad.Teacher;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author STARDUST
 */
public class LoginHelper implements Serializable {
    
     public Administrator Login(String correo, String password){
        return  ServiceFacadeLocator.getInstanceFacadeAdministrator().auth(correo, password);
    }
     
     public Teacher LoginTeacher(String name, String password){
         return ServiceFacadeLocator.getInstanceFacadeTeacher().authTeacher(name, password);
     }
}
