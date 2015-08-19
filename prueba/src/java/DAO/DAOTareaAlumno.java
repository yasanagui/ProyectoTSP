
package DAO;

import Modelo.TareaAlumno;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAOTareaAlumno {
    
    public List<TareaAlumno> tareas(String matricula)
    {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Query consulta=sesion.createQuery("SELECT FROM Tarea-Alumno WHERE matricula='"+matricula+"'");
        List<TareaAlumno> list=consulta.list();
        sesion.close();
        return list;
    }
    
}
