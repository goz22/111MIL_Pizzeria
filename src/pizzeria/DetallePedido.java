/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author utku30
 */
public class DetallePedido {
    
    private int cantidad;
    private float precioOriginalUnitario;
    private Pizza pizza;
    

    public int getCantidad() {
        return cantidad;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioOriginalUnitario() {
        return precioOriginalUnitario;
    }

    public void setPrecioOriginalUnitario(float precioOriginalUnitario) {
        this.precioOriginalUnitario = precioOriginalUnitario;
    }

    public DetallePedido(int cantidad, float precio) {
        this.cantidad = cantidad;
        this.precioOriginalUnitario = precio;
    }
    public  float calcTotalItem() 
    {   float resultado;
        resultado=this.cantidad*this.precioOriginalUnitario;
        return resultado;
    }
    
}

