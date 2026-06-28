package org.emmfogo;

public class Producto {
    private String nombre;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void mostrarProducto() {
        System.out.printf("Producto %s, precio %d%n", this.nombre, this.precio);
    }
}
