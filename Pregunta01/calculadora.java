package pregunta1;


/**
 * PREGUNTA 1 – Sobrecarga de Métodos
 * * Esta clase se llama Calculadora y contiene varios métodos con el mismo nombre
 * "sumar", pero con diferentes parámetros. A esto se le llama sobrecarga.
*/
public class calculadora {

    // --- MÉTODOS SOBRECARGADOS ---

    /**
     * Método #1: Acepta y suma dos números enteros (int).
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de a y b.
     */
    public int sumar(int a, int b) {
        // Imprimimos un mensaje para saber qué método específico se está ejecutando.
        System.out.println("-> Ejecutando sumar(int, int)");
        return a + b;
    }

    /**
     * Método #2 (Sobrecarga): Mismo nombre "sumar", pero ahora acepta tres enteros.
     * Java sabe distinguirlo del anterior por la cantidad de parámetros.
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @param c El tercer número entero.
     * @return La suma de a, b y c.
     */
    public int sumar(int a, int b, int c) {
        System.out.println("-> Ejecutando sumar(int, int, int)");
        return a + b + c;
    }

    /**
     * Método #3 (Sobrecarga): Mismo nombre "sumar", pero ahora con dos decimales (double).
     * Java lo distingue por el TIPO de dato de los parámetros.
     * @param a El primer número decimal.
     * @param b El segundo número decimal.
     * @return La suma de a y b.
     */
    public double sumar(double a, double b) {
        System.out.println("-> Ejecutando sumar(double, double)");
        return a + b;
    }

    /**
     * El método main es el punto de entrada, donde nuestro programa comienza a ejecutarse.
     */
    public static void main(String[] args) {
        
        // 1. Creamos un "objeto" o una "instancia" de nuestra clase Calculadora.
        // Es como encender la calculadora para poder usar sus botones (métodos).
    	calculadora miCalculadora = new calculadora();

        System.out.println("Demostración de la Sobrecarga de Métodos:\n");

        // 2. Demostramos el uso de los tres métodos.
        // Java es lo suficientemente inteligente para saber cuál método 'sumar' debe usar
        // basándose en los argumentos que le pasamos.
        
        // --- Llamada al primer método: sumar(int, int) ---
        int resultadoEnteros = miCalculadora.sumar(10, 5);
        System.out.println("El resultado de sumar 10 + 5 es: " + resultadoEnteros);
        
        System.out.println("------------------------------------");
        
        // --- Llamada al segundo método: sumar(int, int, int) ---
        int resultadoTresEnteros = miCalculadora.sumar(20, 30, 10);
        System.out.println("El resultado de sumar 20 + 30 + 10 es: " + resultadoTresEnteros);
        
        System.out.println("------------------------------------");

        // --- Llamada al tercer método: sumar(double, double) ---
        double resultadoDecimales = miCalculadora.sumar(7.5, 2.5);
        System.out.println("El resultado de sumar 7.5 + 2.5 es: " + resultadoDecimales);
    }
}



	

	