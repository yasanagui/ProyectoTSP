/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Alumno;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class DAOAltaAlumno {
    
     public boolean altaAlumno(int matricula, String nombre, String contraseña)
    {
        try
        {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            //Add new alumno object
            Alumno alumno = new Alumno();
            alumno.setMatricula(matricula);
            alumno.setNombre(nombre);
            alumno.setContrasena(contraseña);

            //Save the alumno in database
            session.save(alumno);
            session.getTransaction().commit();
            session.close();
            //Commit the transaction
            return true;   
        }
        catch(Exception ex)
        {
            return false;
        }
       
    }
}
