package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1



/**
 * Habitaciones generated by hbm2java
 */
public class Habitaciones  implements java.io.Serializable {


     private Integer idHabitacion;
     private AreaTrabajo areaTrabajo;
     private int numeroCamas;
     private boolean estado;

    public Habitaciones() {
    }

    public Habitaciones(AreaTrabajo areaTrabajo, int numeroCamas, boolean estado) {
       this.areaTrabajo = areaTrabajo;
       this.numeroCamas = numeroCamas;
       this.estado = estado;
    }
   
    public Integer getIdHabitacion() {
        return this.idHabitacion;
    }
    
    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    public AreaTrabajo getAreaTrabajo() {
        return this.areaTrabajo;
    }
    
    public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    public int getNumeroCamas() {
        return this.numeroCamas;
    }
    
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }




}


