package com.clases;

public class Televisor extends ProductoElectrodomestico {
    // Atributos
    private int tamanoPantalla;
    private String resolucion;

    // Constructor
    public Televisor(String nombre, double precio, int cantidadDisponible, int tamanoPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
    }

    // Sobrescribir
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println(" | Pantalla: " + tamanoPantalla + "\" | Resolución: " + resolucion);
    }
}