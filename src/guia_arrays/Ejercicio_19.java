package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_19 {

    public static int matriz[][] = new int[4][4];
    public static int matrizTraspuesta[][] = new int[4][4];
    public static int cambio = 0;
    
    public static void main(String[] args) {
        rellenar();
        trasponer();
        simetria();
        mostrar();
    }

    public static void rellenar() {
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 41; columna++) {
                matriz[fila][columna] = Integer.parseInt(JOptionPane.showInputDialog("Fila " + (fila + 1)
                        + "\nColumna " + (columna + 1)));
            }
        }
    }

    public static void trasponer() {
        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {
                matrizTraspuesta[filas][columnas] = matriz[columnas][filas];
            }
        }
    }

    public static void mostrar() {
        for (int fila = 0; fila < 4; fila++) {
            System.out.println("");
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(matrizTraspuesta[fila][columna]);
            }
        }
        System.out.println("");
        if(cambio > 0){
            System.out.println("La matriz no es simetrica");
        } else{
            System.out.println("La matriz es simetrica");
        }
    }

    public static void simetria() {
        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {
                if(matriz[filas][columnas] != matrizTraspuesta[filas][columnas]){
                    cambio++;
                }
            }
        }
    }
    /*SOLO LO VISTO EN CLASE*/
//Declarar 2 vectores, llenarlos y Pasar los de A al B y viceversa (SOLO UN VECTOR)
//Declarar un vector y llenarlo y decir cuantos son primos y cuales son los primos
//Llenar un vector e imprimirlo al reves, invertir el array (NO MAS DE UN VECTOR)
}
