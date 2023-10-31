package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_17 {
    public static int matriz[][] = new int[3][3];
    public static int matrizTraspuesta[][] = new int[3][3];
    public static void main(String[] args){
        rellenar();
        trasponer();
        mostrar();
    }
    public static void rellenar(){
        for(int fila = 0; fila < 3; fila++){
            for(int columna = 0; columna < 3; columna++){
                matriz[fila][columna] = Integer.parseInt(JOptionPane.showInputDialog("Fila " + (fila + 1) +
                        "\nColumna " + (columna + 1)));
            }
        }
    }
    public static void trasponer(){
        for(int filas = 0; filas < 3; filas++){
            for(int columnas = 0; columnas < 3; columnas++){
                matrizTraspuesta[filas][columnas] = matriz[columnas][filas];
            }
        }
    }
    public static void mostrar(){
        for(int fila = 0; fila < 3; fila++){
            System.out.println("");
            for(int columna = 0; columna < 3; columna++){
                System.out.print(matrizTraspuesta[fila][columna]);
            }
        }
        System.out.println("");
    }
    
}
