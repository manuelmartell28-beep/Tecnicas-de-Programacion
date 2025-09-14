package pregunta4;

public class Main {
	  public static void main(String[] args) {
	        Inventario inv = new Inventario();

	        try {
	            System.out.println("Prueba 1: agregando Lápiz");
	            inv.agregarProducto("Lápiz");
	        } catch (IllegalArgumentException e) {
	            System.out.println("⚠️ Error en Lápiz: " + e.getMessage());
	        }

	        try {
	            System.out.println("Prueba 2: agregando Cuaderno");
	            inv.agregarProducto("Cuaderno", 3.50);
	        } catch (IllegalArgumentException e) {
	            System.out.println("⚠️ Error en Cuaderno: " + e.getMessage());
	        }

	        try {
	            System.out.println("Prueba 3: agregando Borrador");
	            inv.agregarProducto("Borrador", 1.25, 10);
	        } catch (IllegalArgumentException e) {
	            System.out.println("⚠️ Error en Borrador: " + e.getMessage());
	        }

	        try {
	            System.out.println("Prueba 4: agregando Regla con precio negativo");
	            inv.agregarProducto("Regla", -2.00, 5);
	        } catch (IllegalArgumentException e) {
	            System.out.println("⚠️ Error en Regla: " + e.getMessage());
	        }

	        // Mostrar inventario
	        inv.listarProductos();
	    }
	}

