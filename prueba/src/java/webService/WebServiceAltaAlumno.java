/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import DAO.DAOAltaAlumno;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jay
 */
@WebService(serviceName = "WebServiceAltaAlumno")
public class WebServiceAltaAlumno {

    @WebMethod(operationName = "altaAlumno")
    public boolean altaAlumno(@WebParam(name = "matricula") int matricula,@WebParam(name = "nombre") String nombre,@WebParam(name = "contraseña") String contraseña) {
        DAOAltaAlumno daoAlumno=new DAOAltaAlumno();
        return daoAlumno.altaAlumno(matricula, nombre, contraseña);
    }
}
