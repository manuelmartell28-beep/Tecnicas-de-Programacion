package pregunta3;

import java.util.ArrayList;
import java.util.List;

public class estudiantes {
	

	
	    public static void main(String[] args) {
	    	
	        // 1. Crear un ArrayList para almacenar nombres de estudiantes
	        List<String> listaEstudiantes = new ArrayList<>();

	        // 2. Agregar al menos 5 nombres
	        listaEstudiantes.add("Pablo");
	        listaEstudiantes.add("Luis");
	        listaEstudiantes.add("Jhonathan");
	        listaEstudiantes.add("Manuel");
	        listaEstudiantes.add("Laura");

	        // 3. Mostrar la lista completa
	        System.out.println("Lista de estudiantes completa:");
	        for (String estudiante : listaEstudiantes) {
	            System.out.println("- " + estudiante);
	        }
	        System.out.println("------------------------------"); // Separador

	        // 4. Eliminar el tercer nombre ingresado (que está en el índice 2)
	        if (listaEstudiantes.size() > 2) { // Asegurarnos de que hay al menos 3 elementos
	            String nombreEliminado = listaEstudiantes.remove(2);
	            System.out.println("Se eliminó a: " + nombreEliminado);
	            System.out.println("------------------------------"); // Separador
	        } else {
	            System.out.println("No se puede eliminar el tercer nombre, la lista tiene menos de 3 elementos.");
	            System.out.println("------------------------------"); // Separador
	        }

	        // 5. Recorrer la lista nuevamente e imprimir los nombres restantes
	        System.out.println("Lista de estudiantes después de la eliminación:");
	        for (String estudiante : listaEstudiantes) {
	            System.out.println("- " + estudiante);
	        }
	    }
	

}
