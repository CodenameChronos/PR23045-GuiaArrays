package guia_arrays;

public class Ejercicio_22 {
    private static int marco[][] = new int[8][6];
    public static void main(String[] args){
        rellenar();
        vaciarCentro();
        mostrar();
    }
    public static void rellenar(){
        for(int fila = 0; fila < 8; fila++){
            for(int columna = 0; columna < 6; columna++){
                marco[fila][columna] = 1;
            }
        }
    }
    public static void vaciarCentro(){
        for(int fila = 1; fila < 7; fila++){
            for(int columna = 1; columna < 5; columna++){
                marco[fila][columna] = 0;
            }
        }
    }
    public static void mostrar(){
        for(int fila = 0; fila < 8; fila++){
            System.out.println("");
            for(int columna = 0; columna < 6; columna++){
                System.out.print(marco[fila][columna] + " ");
            }
        }
        System.out.println("");
    }
}
