/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guill
 */
public class Vehiculo {
    private String marca = "";
    private String modelo = "";
    private int anio = 0;
    private double precio = 0.00;
    private double capacidadCarga = 0.00;
    
    // Constructor
public Vehiculo(String marca, String modelo, int anio, double precio, double capacidadCarga){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.precio = precio;
    this.capacidadCarga = capacidadCarga;
}

// Getters y Setters (todos los atributos)
public String getMarca(){return this.marca;}
public void setMarca(String marca){this.marca = marca;}
public String getModelo(){return this.modelo;}
public void setModelo(String modelo){this.modelo = modelo;}
public int getAnio(){return this.anio;}
public void setAnio(int anio){this.anio = anio;}
public double getPrecio(){return this.precio;}
public void setPrecio(double precio){this.precio = precio;}
public double getCapacidadCarga(){return this.capacidadCarga;}
public void setCapacidadCarga(double capacidadCarga){this.capacidadCarga = capacidadCarga;}

// Método para aplicar descuento
public void aplicarDescuento(double porcentaje){
    
}
// Reduce el precio actual según el porcentaje dado

// Representación en texto
@Override
public String toString(){
    String cadena = marca + modelo + anio + "-" + precio + "- Capacidad:" + capacidadCarga; 
    return cadena;
}
// Salida esperada: Nissan NP300 2024 - $285,000.00 - Capacidad: 1000.0 kg
// Retorna información formateada del vehículo
}
