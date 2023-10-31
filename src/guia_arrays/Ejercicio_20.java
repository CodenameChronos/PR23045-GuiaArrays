package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_20 {
    public static int matriz[][] = new int[3][3];
    public static int matriz2[][] = new int[3][3];
    public static void main(String[] args){
        rellenar();
        mostrar();
    }
    public static void rellenar(){
        JOptionPane.showMessageDialog(null, "Matriz 1");
        for(int fila = 0; fila < 3; fila++){
            for(int columna = 0; columna < 3; columna++){
                matriz[fila][columna] = Integer.parseInt(JOptionPane.showInputDialog("Fila " + (fila + 1) +
                        "\nColumna " + (columna + 1)));
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz 2");
        for(int fila = 0; fila < 3; fila++){
            for(int columna = 0; columna < 3; columna++){
                matriz2[fila][columna] = Integer.parseInt(JOptionPane.showInputDialog("Fila " + (fila + 1) +
                        "\nColumna " + (columna + 1)));
            }
        }
    }
    public static void mostrar(){
        for(int fila = 0; fila < 3; fila++){
            System.out.println("");
            for(int columna = 0; columna < 3; columna++){
                System.out.print(matriz[fila][columna] + matriz2[fila][columna] + " ");
            }
        }
        System.out.println("");
    }
}
