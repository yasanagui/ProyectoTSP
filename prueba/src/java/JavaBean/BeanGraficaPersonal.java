/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBean;

import DAO.DAOTareaAlumno;
import Modelo.TareaAlumno;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import webService.WebServiceGraficaPersonal;


@ManagedBean
@RequestScoped
public class BeanGraficaPersonal 
{
    private String matricula;
    

    public BeanGraficaPersonal() 
    {
        
    }
    
    public List<TareaAlumno> dameDatos(String matricula)
    {
        WebServiceGraficaPersonal wsGP=new WebServiceGraficaPersonal();
        List<TareaAlumno> lista=wsGP.dameDatos(matricula);
        return lista;
    }
     
    public String muestraGrafica(String matricula)
    {
//        List<TareaAlumno> lista=dameDatos(matricula);
//        if(lista!=null)
//        {
            DefaultCategoryDataset Datos = new DefaultCategoryDataset();
            int i;
//            for(i=0;i<lista.size();i++)
//            {
//
//            }
            JFreeChart Grafica;
            Datos.addValue(1, "Negocio 1", "Lunes");
            Datos.addValue(2, "Negocio 1", "Martes");
            Datos.addValue(3, "Negocio 1", "Miércoles");
            Datos.addValue(4, "Negocio 1", "Jueves");
            Datos.addValue(5, "Negocio 1", "Viernes");
            Datos.addValue(6, "Negocio 1", "Sábado");
            Datos.addValue(7, "Negocio 1", "Domingo");
            
            Grafica = ChartFactory.createBarChart("Visitas diarias",
            "Días", "Visitas", Datos,PlotOrientation.HORIZONTAL, true, true, false);
            ChartPanel Panel = new ChartPanel(Grafica);
            JFrame Ventana = new JFrame("JFreeChart");
            Ventana.getContentPane().add(Panel);
            Ventana.pack();
            Ventana.setVisible(true);
            Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            return "VistaDeSeleccionGrafica";
//        }
//        else
//        {
//            String msj="No hay datos";
//            FacesMessage mensaje=new FacesMessage(FacesMessage.SEVERITY_ERROR,msj,"");
//            FacesContext.getCurrentInstance().addMessage(null, mensaje);
//            return "VistaDeSeleccionGrafica";
//        }
        
    }
    
    public static void main(String[] args) {
        BeanGraficaPersonal bean=new BeanGraficaPersonal();
        bean.muestraGrafica("209311662");
    }
    
    
}
