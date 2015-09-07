/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import webService.WebServiceAltaAlumno;

/**
 *
 * @author Jay
 */
@ManagedBean
@RequestScoped
public class BeanAltaAlumno {

    /**
     * Creates a new instance of BeanAltaAlumno
     */
    public BeanAltaAlumno() {
    }
    
    public boolean altaAlumno(int matricula, String nombre, String contraseña)
    {
         WebServiceAltaAlumno ws=new WebServiceAltaAlumno();
         boolean respuesta;
         respuesta=ws.altaAlumno(matricula, nombre , contraseña);
         return respuesta;
    }
    
    
    public static void main(String[] args) {
       
        BeanAltaAlumno ws=new BeanAltaAlumno();
        boolean bandera=ws.altaAlumno(203241, "asdfghjkl", "asdfg");
        System.out.println(bandera);
    }
}
