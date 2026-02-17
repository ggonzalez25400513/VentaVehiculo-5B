/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guill
 */
public class Cliente {
    private String nombre = "";
    private String rfc = "";
    private String telefono = "";
    private String email = "";
    
    // Constructor
public Cliente(String nombre, String rfc, String telefono, String email){
    this.nombre = nombre;
    this.rfc = rfc;
    this.telefono = telefono;
    this.email = email;
}

// Getters y Setters (todos los atributos)
public String getNombre(){return this.nombre;}
public void setNombre(String nombre){this.nombre = nombre;}
public String getRfc(){return this.rfc;}
public void setRfc(String rfc){this.rfc = rfc;}
public String getTelefono(){return this.telefono;}
public void setTelefono(String telefono){this.telefono = telefono;}
public String getEmail(){return this.email;}
public void setEmail(String email){this.email = email;}

// Representación en texto
@Override
public String toString(){
    String cadena = "Cliente: " + this.nombre + "- RFC: " + this.rfc;
    return cadena;
}
// Salida: Cliente: Transportes Rápidos S.A. - RFC: TRA950615XY3
// Retorna información formateada del cliente
}
 