/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import DAO.DAOTareaAlumno;
import Modelo.TareaAlumno;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WebServiceGraficaPersonal")
public class WebServiceGraficaPersonal {

   
    
    @WebMethod(operationName = "dameDatos")
    public List<TareaAlumno> dameDatos(@WebParam(name = "matricula") String matricula) {
        DAOTareaAlumno daoTarea=new DAOTareaAlumno();
        return daoTarea.tareas(matricula);
    }
}
