package pregunta5;

import java.util.Scanner;

//Clase personalizada para manejar la excepción de números negativos
class NumeroNegativoException extends Exception {
 public NumeroNegativoException(String mensaje) {
     super(mensaje);
 }
}

public class pregunta5 {

 // Método que revisa si el número es negativo
 public static void verificarNumero(int numero) throws NumeroNegativoException {
     if (numero < 0) {
         // Lanzamos la excepción personalizada
         throw new NumeroNegativoException("Error: No se permiten números negativos.");
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Pedimos al usuario ingresar un número
         System.out.print("Ingrese un número entero: ");
         String entrada = scanner.nextLine();

         // Convertimos la entrada a entero
         int numero = Integer.parseInt(entrada);

         // Verificamos si es negativo
         verificarNumero(numero);

         // Si todo sale bien mostramos el número
         System.out.println("El número ingresado es: " + numero);

     } catch (NumberFormatException e) {
         // Captura cuando el usuario no ingresa un número válido
         System.out.println("Error: Debe ingresar un valor numérico entero.");

     } catch (NumeroNegativoException e) {
         // Captura cuando el número es negativo
         System.out.println(e.getMessage());

     } finally {
         // Cerramos el scanner
         scanner.close();
         System.out.println("Programa finalizado.");
     }
 }
}

