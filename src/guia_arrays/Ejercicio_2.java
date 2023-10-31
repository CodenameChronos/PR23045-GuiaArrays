package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int num, sum_positivos = 0, cantidad_positivos = 0, cantidad_negativos = 0, sum_negativos = 0, media_neg = 0, media_pos = 0, cantidad_ceros = 0;
        for (int indice = 0; indice < numeros.length; indice++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion " + (indice + 1)));
            numeros[indice] = num;
        }
        for (int indice = 0; indice < numeros.length; indice++) {
            if (numeros[indice] > 0) {
                cantidad_positivos++;
                sum_positivos = sum_positivos + numeros[indice];
            } else if (numeros[indice] < 0) {
                cantidad_negativos++;
                sum_negativos = sum_negativos + numeros[indice];
            } else {
                cantidad_ceros++;
            }
        }
        media_pos = sum_positivos / cantidad_positivos;
        media_neg = sum_negativos / cantidad_negativos;
        System.out.println("La media de los positivos es " + media_pos);
        System.out.println("La media de los negativos es " + media_neg);
        System.out.println("La cantidad de ceros es " + cantidad_ceros);
    }
}
