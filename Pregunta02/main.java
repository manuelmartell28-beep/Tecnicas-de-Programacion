package pregunta2;

import java.util.Scanner;

public class main {

    /**
     * El método main es el punto de entrada, donde nuestro programa comienza a ejecutarse.
     */
    public static void main(String[] args) {
        
        // 1. Creamos una herramienta (objeto) para comunicarnos con el usuario.
        // La clase Scanner nos permite leer lo que el usuario escribe en la consola.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Demostración de Manejo de Errores (División):\n");

        // 2. Utilizamos un bloque "try-catch" como un plan con una red de seguridad.
        // El código dentro de 'try' es el "plan A": lo que intentamos hacer.
        try {
            // --- Solicitud de datos al usuario ---
            System.out.print("Introduce el primer número (dividendo): ");
            int dividendo = scanner.nextInt();

            System.out.print("Introduce el segundo número (divisor): ");
            int divisor = scanner.nextInt();
            
            System.out.println("\n------------------------------------");
            
            // --- La operación de riesgo ---
            // Esta es la línea que podría fallar si el 'divisor' es 0.
            // Si falla, el programa salta inmediatamente al bloque 'catch'.
            System.out.println("-> Intentando calcular " + dividendo + " / " + divisor + "...");
            int resultado = dividendo / divisor;

            // Si la línea anterior no falló, entonces podemos mostrar el resultado.
            System.out.println("El resultado de la división es: " + resultado);

        // El bloque 'catch' es el "plan B" o la red de seguridad.
        // Se activa SOLAMENTE si el 'try' falla debido a un 'ArithmeticException'.
        } catch (ArithmeticException e) {
            
            System.out.println("-> ¡Se ha detectado un error matemático!");
            // Mostramos el mensaje de error específico solicitado en la práctica.
            System.out.println("Error: división entre cero no permitida.");

        // El bloque 'finally' es opcional, pero es una buena práctica incluirlo.
        // Se ejecuta siempre al final, sin importar si hubo un error o no.
        } finally {
            System.out.println("------------------------------------");
            System.out.println("El bloque de 'try-catch' ha finalizado.");
            // 3. Cerramos la herramienta 'scanner' para liberar recursos del sistema.
            scanner.close();
        }
    }
}


