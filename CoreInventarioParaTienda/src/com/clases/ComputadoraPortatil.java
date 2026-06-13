package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    // Atributos
    private String marca;
    private int memoriaRAM;
    private String numeroSerie;

    // Constructor
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRAM, String numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.numeroSerie = numeroSerie;
    }

    // Sobrescribir
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(" | Marca: " + marca + " | RAM: " + memoriaRAM + "GB | S/N: " + numeroSerie);
    }
}