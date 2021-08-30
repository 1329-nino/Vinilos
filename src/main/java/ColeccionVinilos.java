import java.util.Arrays;

public class ColeccionVinilos {
    static String[][] coleccion = new String[100][3];
    static int contador = 0;

    public static void main(String[] args) {
        agregarVinilo("Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo("Iron Maiden", "Killers", "1981");
        agregarVinilo("AC/BC", "Black in Black", "1980");
        agregarVinilo("kiss", "Destroyed", "1976");
        mostrarTotal();
        mostrarDisponibles();
    }

    public static void agregarVinilo(String nombreArtista, String nombreDisco, String ingresarAnio) {
        var vinilo = new String[]{nombreArtista, nombreDisco, ingresarAnio};
        if (contador <= 99) {
            for (int j = 0; j < 3; j++) {
                coleccion[contador][j] = vinilo[j];
            }
            contador++;
        }

    }

    public static boolean buscarArtista(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (coleccion[i][0].equals(nombre)) {
                return true;
            }
        }
        return false;

    }

    public static void mostrarArtista(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (coleccion[i][0].equals(nombre)) {
                System.out.println(Arrays.toString(coleccion[i]));
                return;
            }
        }
        System.out.println("No se encuentra el artista");
    }

    public static void mostrarTotal() {
        System.out.println("El total de vinilos es " + contador);
    }

    public static void mostrarColeccion() {
        for (int i = 0; i < coleccion.length; i++) {
            System.out.println(Arrays.deepToString(coleccion[i]));
        }
    }

    public static int Disponibles() {
        return 100 - contador;
    }

    public static void mostrarDisponibles() {
        System.out.println("Quedan " + (100 - contador) + " espacios disponibles");
    }
}
