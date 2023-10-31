package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_21 {

    public static int tamanio;
    public static int array[], array2[];
    public int bubble_iteration = array.length - 1;

    public static void main(String[] args) {
        rellenar();
        Ejercicio_21 Ej = new Ejercicio_21();
        Ej.invertir();
        mostrar();
    }

    public static void rellenar() {
        do {
            tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array"));
        } while (tamanio < 1);
        array = new int[tamanio];
        array2 = new int[tamanio];
        for (int rellenado = 0; rellenado < array.length; rellenado++) {
            array[rellenado] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion " + (rellenado + 1)));
            array2[rellenado] = array[rellenado];
        }
    }

    public void invertir() {
        for (int invert = 0; invert < array.length / 2; invert++) {
            int bubble = array[bubble_iteration];
            array2[bubble_iteration] = array[invert];
            array2[invert] = bubble;
            bubble_iteration--;
        }
    }

    public static void mostrar() {
        for (int iteration = 0; iteration < array.length; iteration++) {
            JOptionPane.showMessageDialog(null, array2[iteration]);
        }
    }
}
