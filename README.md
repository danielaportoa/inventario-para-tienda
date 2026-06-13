# inventario para tienda

# 🛒 Inventario para Tienda - Gestión de Electrodomésticos en Java

Este proyecto consiste en un sistema modular de gestión de inventario para una tienda electrónica desarrollado en Java utilizando **Spring Tool Suite (STS)**. La aplicación implementa conceptos avanzados de la **Programación Orientada a Objetos (POO)**, modelando un catálogo de productos a través de relaciones de **Herencia**, **Sobrecarga de Constructores**, **Sobrescritura de Métodos** y **Colecciones Polimórficas**.

## 🎯 Objetivos del Proyecto
* **Aplicar el Principio de Herencia:** Abstraer los atributos y comportamientos comunes a una clase base (`ProductoElectrodomestico`) y extenderlos hacia clases derivadas especializadas (`Televisor` y `ComputadoraPortatil`).
* **Implementar Sobrecarga y Reutilización:** Utilizar la palabra clave `super` para invocar constructores de la clase madre y sobrecargar constructores para gestionar productos sin stock inicial por defecto.
* **Dominar el Polimorfismo Dinámico:** Almacenar de forma polimórfica múltiples subtipos de productos dentro de un único `ArrayList<ProductoElectrodomestico>` en la clase `TiendaElectronica`.
* **Simular Lógica de Negocio:** Diseñar algoritmos controlados para la búsqueda de productos y la ejecución de ventas, automatizando la reducción de existencias e impidiendo transacciones de productos agotados.

---

## 🛠️ Estructura y Arquitectura del Proyecto

Para asegurar que el compilador de Java en entornos como STS/Eclipse enlace correctamente los espacios de nombres (*packages*), el árbol de directorios del código fuente se organiza rigurosamente de la siguiente manera:

```text
Inventario para Tienda/
└── src/
    ├── com/
    │   └── Aplicacion.java
    └── com/clases/
        ├── ProductoElectrodomestico.java
        ├── Televisor.java
        ├── ComputadoraPortatil.java
        └── TiendaElectronica.java
