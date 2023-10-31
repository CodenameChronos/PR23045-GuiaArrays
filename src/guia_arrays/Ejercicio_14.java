package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_14 {

    public static void main(String[] args) {
        int bubble = 0;
        int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98, 45};
        int numerosAscendentes[] = new int[numerosDesordenados.length];
        int numerosDescendentes[] = new int[numerosDesordenados.length];
        igualar(numerosAscendentes, numerosDescendentes, numerosDesordenados);
        ordenarAscendentes(bubble, numerosAscendentes);
        ordenarDescendentes(bubble, numerosDescendentes);
        mostrar(numerosAscendentes, numerosDescendentes, numerosDesordenados);

    }

    public static void igualar(int numerosAscendentes[], int numerosDescendentes[], int numerosDesordenados[]) {
        //igualar arrays
        for (int igual = 0; igual < numerosDesordenados.length; igual++) {
            numerosAscendentes[igual] = numerosDesordenados[igual];
            numerosDescendentes[igual] = numerosDesordenados[igual];
        }
    }

    public static void ordenarAscendentes(int bubble, int numerosAscendentes[]) {
        //Asc
        for (int asc = 0; asc < numerosAscendentes.length; asc++) {
            for (int asc2 = 0; asc2 < numerosAscendentes.length - 1; asc2++) {
                if (numerosAscendentes[asc2] > numerosAscendentes[asc2 + 1] && asc2 != 9) {
                    bubble = numerosAscendentes[asc2 + 1];
                    numerosAscendentes[asc2 + 1] = numerosAscendentes[asc2];
                    numerosAscendentes[asc2] = bubble;
                }
            }
        }
    }

    public static void ordenarDescendentes(int bubble, int numerosDescendentes[]) {
        //Desc
        for (int desc = 0; desc < numerosDescendentes.length; desc++) {
            for (int desc2 = 0; desc2 < numerosDescendentes.length - 1; desc2++) {
                if (numerosDescendentes[desc2] < numerosDescendentes[desc2 + 1] && desc2 != 9) {
                    bubble = numerosDescendentes[desc2 + 1];
                    numerosDescendentes[desc2 + 1] = numerosDescendentes[desc2];
                    numerosDescendentes[desc2] = bubble;
                    System.out.println();
                }
            }
        }
    }

    public static void mostrar(int numerosAscendentes[], int numerosDescendentes[], int numerosDesordenados[]) {
        //Mostrar
        JOptionPane.showMessageDialog(null, "Vector original");
        for (int M = 0; M < numerosDesordenados.length; M++) {
            JOptionPane.showMessageDialog(null, numerosDesordenados[M]);
        }
        JOptionPane.showMessageDialog(null, "Vector ascendente");
        for (int M = 0; M < numerosDesordenados.length; M++) {
            JOptionPane.showMessageDialog(null, numerosAscendentes[M]);
        }
        JOptionPane.showMessageDialog(null, "Vector descendente");
        for (int M = 0; M < numerosDesordenados.length; M++) {
            JOptionPane.showMessageDialog(null, numerosDescendentes[M]);
        }
    }
}
