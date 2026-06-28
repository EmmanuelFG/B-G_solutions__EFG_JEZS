package org.emmfogo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Producto> productos;
    private final String descuento;
    private String id;
    private String medioPago;
    private int precioAcumulado;

    public Pedido() {
        this.productos = new ArrayList<>();
        descuento = null;

    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        precioAcumulado += producto.getPrecio();

    }


    public void mostrarPedido() {
        System.out.println(this.id);
        if (productos.isEmpty()) {
            System.out.println("El pedido se encuentra vacío");
        } else {
            productos.stream().forEach(Producto::mostrarProducto);
            System.out.println("Precio Acumulado: " + precioAcumulado);
            System.out.println("Medio de pago: ");
            System.out.println("Descuento: ");
        }

    }
}
