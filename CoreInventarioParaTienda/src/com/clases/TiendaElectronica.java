package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    // Constructor
    public TiendaElectronica() {
        this.listaDeProductos = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
        System.out.println("[INVENTARIO] Agregado con éxito: " + producto.getNombre());
    }

    // Muestra todos los productos disponibles
    public void mostrarInventario() {
        System.out.println("\n=====================================================================");
        System.out.println("                   INVENTARIO DE LA TIENDA                           ");
        System.out.println("=====================================================================");
        if (listaDeProductos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (ProductoElectrodomestico prod : listaDeProductos) {
                prod.mostrarInformacion(); 
            }
        }
        System.out.println("=====================================================================\n");
    }

    //Busca un producto por su nombre
    public ProductoElectrodomestico buscarProducto(String nombreBuscar) {
        for (ProductoElectrodomestico prod : listaDeProductos) {
            if (prod.getNombre().equalsIgnoreCase(nombreBuscar)) {
                return prod;
            }
        }
        return null;
    }

    // Disminuye stock
    public void realizarVenta(String nombreProducto) {
        ProductoElectrodomestico prod = buscarProducto(nombreProducto);

        if (prod != null) {
            int stockActual = prod.getCantidadDisponible();
            if (stockActual > 0) {
                prod.setCantidadDisponible(stockActual - 1);
                System.out.println("-> [VENTA EXITOSA] Se vendió 1 unidad de: " + prod.getNombre() + ". Nuevo stock: " + prod.getCantidadDisponible());
            } else {
                System.out.println("-> [VENTA RECHAZADA] Producto agotado: " + prod.getNombre());
            }
        } else {
            System.out.println("-> [ERROR] El producto '" + nombreProducto + "' no existe en el catálogo.");
        }
    }
}