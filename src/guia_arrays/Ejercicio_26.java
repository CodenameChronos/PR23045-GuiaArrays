package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_26 {

    public static void main(String[] args) {
        int numFilas = 0;
        while (numFilas < 6 || numFilas > 10) {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad de filas para el microbús (entre 6 y 10):");
            numFilas = Integer.parseInt(input);
        }

        int[] ladoIzquierdo = new int[numFilas];
        int[] ladoDerecho = new int[numFilas];

        for (int i = 0; i < numFilas; i++) {
            ladoIzquierdo[i] = -1;
            ladoDerecho[i] = -1;
        }

        int totalVentas = 0;

        while (true) {
            String menu = "Menú de Opciones:\n"
                    + "1. Ver Distribución\n"
                    + "2. Vender Asientos\n"
                    + "3. Devolver Asientos\n"
                    + "4. Mostrar la Caja\n"
                    + "5. Salir";

            String opcion = JOptionPane.showInputDialog(menu);
            int seleccion = Integer.parseInt(opcion);

            switch (seleccion) {
                case 1:
                    mostrarDistribucion(ladoIzquierdo, ladoDerecho);
                    break;
                case 2:
                    venderAsientos(ladoIzquierdo, ladoDerecho, totalVentas);
                    break;
                case 3:
                    devolverAsientos(ladoIzquierdo, ladoDerecho, totalVentas);
                    break;
                case 4:
                    mostrarCaja(totalVentas);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    public static void mostrarDistribucion(int[] ladoIzquierdo, int[] ladoDerecho) {
        String distribucion = "Distribución actual de asientos:\n"
                + "Lado Izquierdo: " + java.util.Arrays.toString(ladoIzquierdo) + "\n"
                + "Lado Derecho: " + java.util.Arrays.toString(ladoDerecho);

        JOptionPane.showMessageDialog(null, distribucion);
    }

    public static void venderAsientos(int[] ladoIzquierdo, int[] ladoDerecho, int totalVentas) {
        String ladoSeleccion = JOptionPane.showInputDialog("Seleccione el lado (1 para Izquierdo, 2 para Derecho):");
        int lado = Integer.parseInt(ladoSeleccion);

        if (lado != 1 && lado != 2) {
            JOptionPane.showMessageDialog(null, "Lado no válido. Seleccione 1 o 2.");
            return;
        }

        int[] ladoSeleccionado = (lado == 1) ? ladoIzquierdo : ladoDerecho;

        String cantidadSeleccion = JOptionPane.showInputDialog("Cantidad de asientos a vender (1 o 2):");
        int cantidad = Integer.parseInt(cantidadSeleccion);

        if (cantidad != 1 && cantidad != 2) {
            JOptionPane.showMessageDialog(null, "Cantidad no válida. Seleccione 1 o 2.");
            return;
        }

        String filaSeleccion = JOptionPane.showInputDialog("Fila (1-" + ladoSeleccionado.length + "):");
        int fila = Integer.parseInt(filaSeleccion);

        if (fila < 1 || fila > ladoSeleccionado.length) {
            JOptionPane.showMessageDialog(null, "Fila no válida. Seleccione una fila dentro del rango.");
            return;
        }

        if (ladoSeleccionado[fila - 1] == -1) {
            for (int i = fila - 1; i < fila - 1 + cantidad; i++) {
                ladoSeleccionado[i] = 1;
            }
            totalVentas += cantidad;
            JOptionPane.showMessageDialog(null, "Venta exitosa.");
        } else {
            JOptionPane.showMessageDialog(null, "Los asientos seleccionados ya están ocupados.");
        }
    }

    public static void devolverAsientos(int[] ladoIzquierdo, int[] ladoDerecho, int totalVentas) {
        String ladoSeleccion = JOptionPane.showInputDialog("Seleccione el lado (1 para Izquierdo, 2 para Derecho):");
        int lado = Integer.parseInt(ladoSeleccion);

        if (lado != 1 && lado != 2) {
            JOptionPane.showMessageDialog(null, "Lado no válido. Seleccione 1 o 2.");
            return;
        }

        int[] ladoSeleccionado = (lado == 1) ? ladoIzquierdo : ladoDerecho;

        String filaSeleccion = JOptionPane.showInputDialog("Fila (1-" + ladoSeleccionado.length + "):");
        int fila = Integer.parseInt(filaSeleccion);

        if (fila < 1 || fila > ladoSeleccionado.length) {
            JOptionPane.showMessageDialog(null, "Fila no válida. Seleccione una fila dentro del rango.");
            return;
        }

        if (ladoSeleccionado[fila - 1] == 1) {
            ladoSeleccionado[fila - 1] = -1;
            totalVentas--;
            JOptionPane.showMessageDialog(null, "Devolución exitosa.");
        } else {
            JOptionPane.showMessageDialog(null, "El asiento seleccionado no está ocupado.");
        }
    }

    public static void mostrarCaja(int totalVentas) {
        JOptionPane.showMessageDialog(null, "Total de ventas acumulado hasta el momento: $" + totalVentas);
    }
}
