import java.io.*;
import java.util.*;

public class TablaHashTesting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new HashSet<>();

        System.out.println("Ingrese la cantidad de nombres:");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese los nombres:");
        for (int i = 0; i < n; i++) {
            String nombre = sc.nextLine();
            nombres.add(nombre); // se almacenan en la tabla hash
        }

        System.out.println("Nombres ingresados (sin orden):");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println();

        // Ordenar nombres
        List<String> listaOrdenada = TablaHash.ordenarNombres(nombres);

        System.out.println("Nombres ordenados:");
        TablaHash.imprimirLista(listaOrdenada);

        // Guardar en archivo
        TablaHash.guardarEnArchivo(listaOrdenada, "salida.txt");
        System.out.println("La lista ordenada se guardó en salida.txt");

        sc.close();
    }
}