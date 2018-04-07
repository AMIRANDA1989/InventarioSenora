/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allan
 */
public class Factura {
    private String fechaFactura; //Una fecha que puede guardarse como cadena
    private String horaFactura;  //Se puede guardar la hora por separado tambien
    private Producto[] producto; //un array de productos dado que se puede comprar mas de uno
    private float total;         //total de factura

    public Factura(String fechaFactura, String horaFactura, Producto[] producto, float total) {
        this.fechaFactura = fechaFactura;
        this.horaFactura = horaFactura;
        this.producto = producto;
        this.total = total;
    }
    
    //Si bien se puede agregar desde afuera el total, tambien es posible que la clase factura lo procese
    private void calcularTotal(){
        float suma = 0;
        
        for (Producto producto1 : producto) {
            suma = suma + producto1.getPrecio();
        }
        
        this.setTotal(suma);
    }
    
    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getHoraFactura() {
        return horaFactura;
    }

    public void setHoraFactura(String horaFactura) {
        this.horaFactura = horaFactura;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    
    
    
}
