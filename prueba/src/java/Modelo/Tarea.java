package Modelo;
// Generated 19/08/2015 04:41:40 PM by Hibernate Tools 4.3.1



/**
 * Tarea generated by hbm2java
 */
public class Tarea  implements java.io.Serializable {


     private int idTarea;
     private String nombreTarea;

    public Tarea() {
    }

    public Tarea(int idTarea, String nombreTarea) {
       this.idTarea = idTarea;
       this.nombreTarea = nombreTarea;
    }
   
    public int getIdTarea() {
        return this.idTarea;
    }
    
    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }
    public String getNombreTarea() {
        return this.nombreTarea;
    }
    
    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }




}


