/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guill
 */
public class Venta {
    //Atributos
    private String folio;
    private int cantidadVehiculos;
    private final Vehiculo vehiculo;
    private final Cliente cliente;
    
    // Constructor
    public Venta(String folio, int cantidadVehiculos, Vehiculo vehiculo, Cliente cliente){
    // Recibe el folio como parámetro
        this.folio = folio;
        this.cantidadVehiculos = cantidadVehiculos;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }
    
    // Getters únicamente (NO setters - la venta es inmutable)
    public String getFolio(){return this.folio;}
    public int getCantidadVehiculos(){return this.cantidadVehiculos;}
    public Vehiculo getVehiculo(){return this.vehiculo;}
    public Cliente getCliente(){return this.cliente;}

    // Cálculo del total SIN descuento
    public double calcularTotal(){
        return cantidadVehiculos * vehiculo.getPrecio();
    }
    // Retorna: cantidadVehiculos * precio del vehículo

    // Aplicar descuento por volumen
    public double aplicarDescuentoPorVolumen(){
        double precioSinDescuento = calcularTotal();
        double precioConDescuento = 0.00;
    
    if (this.cantidadVehiculos >= 10){
        precioConDescuento = precioSinDescuento * 0.10;
    } else if(this.cantidadVehiculos >= 5){
        precioConDescuento = precioSinDescuento * 0.05;
    } else if(this.cantidadVehiculos < 5){
        precioConDescuento = precioSinDescuento;
    }
    return precioConDescuento;
    }
    // Lógica:
    // - Si cantidadVehiculos >= 10: descuento del 10   %
    // - Si cantidadVehiculos >= 5: descuento del 5%
    // - Si cantidadVehiculos < 5: sin descuento (0%)
    // Retorna: total con descuento aplicado
    // Representación en texto
    @Override
    public String toString(){
        String cadena = "Folio: " + this.folio + "\n" +
                    "Cantidad de vehiculos: " + this.cantidadVehiculos;
        return cadena;
    }
}
