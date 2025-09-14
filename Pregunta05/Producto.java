package pregunta4;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor con validación
    public Producto(String nombre, double precio, int cantidad) {
        if (precio < 0) {
            throw new IllegalArgumentException("Precio no puede ser negativo: " + precio);
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad no puede ser negativa: " + cantidad);
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - S/ " + String.format("%.2f", precio) + " (x " + cantidad + ")";
    }
}