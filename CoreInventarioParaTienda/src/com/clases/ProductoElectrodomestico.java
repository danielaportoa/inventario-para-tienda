package com.clases;

public class ProductoElectrodomestico {
    // Atributos protegidos 
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor
    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Constructor Sobrecargado
    public ProductoElectrodomestico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCantidadDisponible() { return cantidadDisponible; }
    public void setCantidadDisponible(int cantidadDisponible) { this.cantidadDisponible = cantidadDisponible; }

    // Mostrar información 
    public void mostrarInformacion() {
        System.out.print("Producto: " + nombre + " | Precio: $" + (int)precio + " | Stock: " + cantidadDisponible);
    }
}