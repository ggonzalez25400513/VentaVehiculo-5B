public class Main {
    public static void main(String[] args){
        //Vehiculos:
        Vehiculo v1 = new Vehiculo("Toyota" , "Hilux" , 2024 , 497800, 1220);
        Vehiculo v2 = new Vehiculo("Toyota" , "Tacoma" , 2025, 1167500, 7730);
        Vehiculo v3 = new Vehiculo("Toyota", "Tundra HEV", 2025, 1486000, 890);
        //Clientes
        Cliente c1 = new Cliente("Innovaciones Tecnológicas del Norte, S.A. de C.V.","AAMJ800101XYZ","3114100247", "juan.araiza.demo@ejemplo.com");
        Cliente c2 = new Cliente("Servicios Logísticos del Bajío, S.A. de C.V.","GOPL700515ABC","3114589721", "laura.gomez.test@ficticio.net");
        Cliente c3 = new Cliente("Comercializadora de Alimentos del Sur, S.A. de C.V.","RIRM901231XYZ","3111749217", "contacto.empresaX@noexiste.org");
        //Ventas
        Venta V1 = new Venta("VTA-001", 15,v1,c1); 
        Venta V2 = new Venta("VTA-002", 10, v2,c2);
        Venta V3 = new Venta("VTA-003", 5, v3, c3);
        //Salida de datos
        System.out.println("=== SISTEMA DE VENTAS - FLOTILLAS URBANAS === " );
        System.out.println("======================================== " );
        System.out.println("               VENTA #1" );
        System.out.println("======================================== " );
        System.out.println("Folio: " + V1.getFolio() + "\n");
        System.out.println("Cliente: " + V1.getCliente().getNombre());
        System.out.println("RFC: " + V1.getCliente().getRfc() );
        System.out.println("Vehículo: " + V1.getVehiculo().getMarca() + " " + V1.getVehiculo().getModelo() + " " + V1.getVehiculo().getAnio() );
        System.out.println("Capacidad de Carga: " +V1.getVehiculo().getCapacidadCarga() + "kg ");
        System.out.println("Cantidad: " + V1.getCantidadVehiculos()+ " unidades ");
        System.out.println("Precio Unitario: " + "$"+ V1.getVehiculo().getPrecio() );
        System.out.println("----------------------------------------" );
        System.out.println("Subtotal: " + "$"+ V1.calcularTotal() );
        System.out.println("Descuento: " + "$" + V1.aplicarDescuentoPorVolumen() );
        System.out.println("========================================");
        System.out.println("TOTAL A PAGAR: $" + (V1.calcularTotal() - V1.aplicarDescuentoPorVolumen()));
        System.out.println("========================================");
        System.out.println("");
        System.out.println("");
        System.out.println("======================================== " );
        System.out.println("               VENTA #2");
        System.out.println("======================================== " );
        System.out.println("Folio: " + V2.getFolio() + "\n");
        System.out.println("Cliente: " + V2.getCliente().getNombre());
        System.out.println("RFC: " + V2.getCliente().getRfc() );
        System.out.println("Vehículo: " + V2.getVehiculo().getMarca() + " " + V2.getVehiculo().getModelo() + " " + V2.getVehiculo().getAnio() );
        System.out.println("Capacidad de Carga: " +V2.getVehiculo().getCapacidadCarga() + "kg ");
        System.out.println("Cantidad: " + V2.getCantidadVehiculos()+ " unidades ");
        System.out.println("Precio Unitario: " + "$"+ V2.getVehiculo().getPrecio() );
        System.out.println("----------------------------------------" );
        System.out.println("Subtotal: " + "$"+ V2.calcularTotal() );
        System.out.println("Descuento: " + "$" + V2.aplicarDescuentoPorVolumen() );
        System.out.println("========================================");
        System.out.println("TOTAL A PAGAR: $" + (V2.calcularTotal() - V2.aplicarDescuentoPorVolumen()));
        System.out.println("========================================");
        System.out.println("");
        System.out.println("");
        System.out.println("               VENTA #3" );
        System.out.println("======================================== " );
        System.out.println("Folio: " + V3.getFolio() + "\n");
        System.out.println("Cliente: " + V3.getCliente().getNombre());
        System.out.println("RFC: " + V3.getCliente().getRfc() );
        System.out.println("Vehículo: " + V3.getVehiculo().getMarca() + " " + V3.getVehiculo().getModelo() + " " + V3.getVehiculo().getAnio() );
        System.out.println("Capacidad de Carga: " +V3.getVehiculo().getCapacidadCarga() + "kg ");
        System.out.println("Cantidad: " + V3.getCantidadVehiculos()+ " unidades ");
        System.out.println("Precio Unitario: " + "$"+ V3.getVehiculo().getPrecio() );
        System.out.println("----------------------------------------" );
        System.out.println("Subtotal: " + "$"+ V3.calcularTotal() );
        System.out.println("Descuento: " + "$" + V3.aplicarDescuentoPorVolumen() );
        System.out.println("========================================");
        System.out.println("TOTAL A PAGAR: $" + (V3.calcularTotal() - V3.aplicarDescuentoPorVolumen()));
        System.out.println("========================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Total de Ventas Procesadas: 3");
    }
}
