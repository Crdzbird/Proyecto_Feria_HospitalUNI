package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DetalleCompra generated by hbm2java
 */
public class DetalleCompra  implements java.io.Serializable {


     private Integer idDetalleCompra;
     private Compra compra;
     private Producto producto;
     private Date fechaVencimiento;
     private int unidadesCompradas;
     private BigDecimal costoCompraUnit;
     private float descuento;
     private String modoAdquisicion;
     private int unidsDisponibles;
     private Set inventarioGenerals = new HashSet(0);
     private Set devolucionCompras = new HashSet(0);

    public DetalleCompra() {
    }

	
    public DetalleCompra(Compra compra, Producto producto, Date fechaVencimiento, int unidadesCompradas, BigDecimal costoCompraUnit, float descuento, String modoAdquisicion, int unidsDisponibles) {
        this.compra = compra;
        this.producto = producto;
        this.fechaVencimiento = fechaVencimiento;
        this.unidadesCompradas = unidadesCompradas;
        this.costoCompraUnit = costoCompraUnit;
        this.descuento = descuento;
        this.modoAdquisicion = modoAdquisicion;
        this.unidsDisponibles = unidsDisponibles;
    }
    public DetalleCompra(Compra compra, Producto producto, Date fechaVencimiento, int unidadesCompradas, BigDecimal costoCompraUnit, float descuento, String modoAdquisicion, int unidsDisponibles, Set inventarioGenerals, Set devolucionCompras) {
       this.compra = compra;
       this.producto = producto;
       this.fechaVencimiento = fechaVencimiento;
       this.unidadesCompradas = unidadesCompradas;
       this.costoCompraUnit = costoCompraUnit;
       this.descuento = descuento;
       this.modoAdquisicion = modoAdquisicion;
       this.unidsDisponibles = unidsDisponibles;
       this.inventarioGenerals = inventarioGenerals;
       this.devolucionCompras = devolucionCompras;
    }
   
    public Integer getIdDetalleCompra() {
        return this.idDetalleCompra;
    }
    
    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }
    public Compra getCompra() {
        return this.compra;
    }
    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public int getUnidadesCompradas() {
        return this.unidadesCompradas;
    }
    
    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }
    public BigDecimal getCostoCompraUnit() {
        return this.costoCompraUnit;
    }
    
    public void setCostoCompraUnit(BigDecimal costoCompraUnit) {
        this.costoCompraUnit = costoCompraUnit;
    }
    public float getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    public String getModoAdquisicion() {
        return this.modoAdquisicion;
    }
    
    public void setModoAdquisicion(String modoAdquisicion) {
        this.modoAdquisicion = modoAdquisicion;
    }
    public int getUnidsDisponibles() {
        return this.unidsDisponibles;
    }
    
    public void setUnidsDisponibles(int unidsDisponibles) {
        this.unidsDisponibles = unidsDisponibles;
    }
    public Set getInventarioGenerals() {
        return this.inventarioGenerals;
    }
    
    public void setInventarioGenerals(Set inventarioGenerals) {
        this.inventarioGenerals = inventarioGenerals;
    }
    public Set getDevolucionCompras() {
        return this.devolucionCompras;
    }
    
    public void setDevolucionCompras(Set devolucionCompras) {
        this.devolucionCompras = devolucionCompras;
    }




}


