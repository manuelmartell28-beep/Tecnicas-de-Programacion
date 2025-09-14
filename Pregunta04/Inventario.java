package pregunta4;

import java.util.ArrayList;

public class Inventario {

	 private ArrayList<Producto> productos;

	    public Inventario() {
	        productos = new ArrayList<>();
	    }

	    // Sobrecarga 1: solo nombre
	    public void agregarProducto(String nombre) {
	        agregarProducto(nombre, 0.0, 1);
	    }

	    // Sobrecarga 2: nombre + precio
	    public void agregarProducto(String nombre, double precio) {
	        agregarProducto(nombre, precio, 1);
	    }

	    // Sobrecarga 3: nombre + precio + cantidad
	    public void agregarProducto(String nombre, double precio, int cantidad) {
	        // Aquí ya NO se atrapa el error
	        Producto p = new Producto(nombre, precio, cantidad);
	        productos.add(p);
	    }

	    public void listarProductos() {
	        System.out.println("\n📦 Contenido del inventario:");
	        for (int i = 0; i < productos.size(); i++) {
	            System.out.println((i + 1) + ") " + productos.get(i));
	        }
	    }
	}