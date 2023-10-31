package guia_arrays;
public class Ejercicio_18 {
    private static final int matriz[][] = new int[7][7];
    public static void main(String[] args){
        rellenar();
        mostrar();
    }
    public static void rellenar(){
        //int fil, col;
        for(int relleno = 0; relleno < 7; relleno++){
            matriz[relleno][relleno] = 1;
        }
    }
     public static void mostrar(){
        for(int fila = 0; fila < 7; fila++){
            System.out.println("");
            for(int columna = 0; columna < 7; columna++){
                System.out.print(matriz[fila][columna] + " ");
            }
        }
         System.out.println("");
    }
}
