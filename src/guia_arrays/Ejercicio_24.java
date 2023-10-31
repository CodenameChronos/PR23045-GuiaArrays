package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_24 {

    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        int[] arrayNoDuplicados = new int[arrayOriginal.length];

        //mames NetBeans me hizo el bucle for para clonar array en una sola línea xD
        System.arraycopy(arrayOriginal, 0, arrayNoDuplicados, 0, arrayOriginal.length);

        for (int copia = 0; copia < arrayNoDuplicados.length; copia++) {
            for (int copia2 = 0; copia2 < arrayNoDuplicados.length; copia2++) {
                if (arrayNoDuplicados[copia2] == arrayNoDuplicados[copia] && copia != copia2) {
                    arrayNoDuplicados[copia2] = 0;
                }
            }
        }

        for (int orden = 0; orden < arrayNoDuplicados.length; orden++) {
            for (int orden2 = 0; orden2 < arrayNoDuplicados.length - 1; orden2++) {
                if (arrayNoDuplicados[orden2] == 0) {
                    arrayNoDuplicados[orden2] = arrayNoDuplicados[orden2 + 1];
                    arrayNoDuplicados[orden2 + 1] = 0;
                }
            }
        }

        for (int posicion = 0; posicion < arrayNoDuplicados.length; posicion++) {
            JOptionPane.showMessageDialog(null, arrayNoDuplicados[posicion]);
        }
    }
}
