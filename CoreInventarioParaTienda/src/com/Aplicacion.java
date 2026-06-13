package com;

import com.clases.ComputadoraPortatil;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("=== CONFIGURACIÓN DE TIENDA ELECTRÓNICA ===\n");

        TiendaElectronica miTienda = new TiendaElectronica();

        // agregar al inventario
        Televisor tv1 = new Televisor("LG OLED SmartTV", 799990, 2, 55, "4K Ultra HD");
        Televisor tv2 = new Televisor("Samsung Crystal", 349990, 0, 50, "4K Smart"); 
        
        ComputadoraPortatil laptop1 = new ComputadoraPortatil("MacBook Air M1", 849990, 3, "Apple", 8, "C02F89XXQ6L4");
        ComputadoraPortatil laptop2 = new ComputadoraPortatil("Asus Tuf Gaming", 699990, 1, "Asus", 16, "AS-7710293");

        // Registrar productos en la tienda
        miTienda.agregarProducto(tv1);
        miTienda.agregarProducto(tv2);
        miTienda.agregarProducto(laptop1);
        miTienda.agregarProducto(laptop2);

        miTienda.mostrarInventario();

        System.out.println("=== SIMULACIÓN DE VENTAS ===");
        
        miTienda.realizarVenta("MacBook Air M1");
        
        miTienda.realizarVenta("Asus Tuf Gaming");
        
        // Producto agotado
        miTienda.realizarVenta("Asus Tuf Gaming");
        
        miTienda.realizarVenta("Samsung Crystal");

        // Mostrar el inventario final 
        miTienda.mostrarInventario();
    }
}