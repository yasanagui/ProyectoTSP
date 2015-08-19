package Modelo;
// Generated 19/08/2015 04:41:40 PM by Hibernate Tools 4.3.1



/**
 * FaseAlumnoTareaId generated by hbm2java
 */
public class FaseAlumnoTareaId  implements java.io.Serializable {


     private int idFase;
     private int idTarea;
     private int alumnoHasGrupoAlumnoMatricula;

    public FaseAlumnoTareaId() {
    }

    public FaseAlumnoTareaId(int idFase, int idTarea, int alumnoHasGrupoAlumnoMatricula) {
       this.idFase = idFase;
       this.idTarea = idTarea;
       this.alumnoHasGrupoAlumnoMatricula = alumnoHasGrupoAlumnoMatricula;
    }
   
    public int getIdFase() {
        return this.idFase;
    }
    
    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }
    public int getIdTarea() {
        return this.idTarea;
    }
    
    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }
    public int getAlumnoHasGrupoAlumnoMatricula() {
        return this.alumnoHasGrupoAlumnoMatricula;
    }
    
    public void setAlumnoHasGrupoAlumnoMatricula(int alumnoHasGrupoAlumnoMatricula) {
        this.alumnoHasGrupoAlumnoMatricula = alumnoHasGrupoAlumnoMatricula;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FaseAlumnoTareaId) ) return false;
		 FaseAlumnoTareaId castOther = ( FaseAlumnoTareaId ) other; 
         
		 return (this.getIdFase()==castOther.getIdFase())
 && (this.getIdTarea()==castOther.getIdTarea())
 && (this.getAlumnoHasGrupoAlumnoMatricula()==castOther.getAlumnoHasGrupoAlumnoMatricula());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdFase();
         result = 37 * result + this.getIdTarea();
         result = 37 * result + this.getAlumnoHasGrupoAlumnoMatricula();
         return result;
   }   


}


