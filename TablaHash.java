import java.io.*;
import java.util.*;

public class TablaHash {

    // Método para ordenar nombres
    public static List<String> ordenarNombres(Set<String> nombres) {
        List<String> lista = new ArrayList<>(nombres);
        Collections.sort(lista); // orden alfabético
        return lista;
    }

    // Método para imprimir lista de los nombres
    public static void imprimirLista(List<String> lista) {
        for (String nombre : lista) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }

    // Guarda lista en archivo salida.txt
    public static void guardarEnArchivo(List<String> lista, String nombreArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
        for (String nombre : lista) {
            bw.write(nombre + " ");
        }
        bw.close();
    }
}