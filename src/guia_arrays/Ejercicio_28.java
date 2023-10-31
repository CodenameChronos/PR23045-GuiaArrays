package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_28 {
    public static void main(String[] args) {
        int numEstudiantes, numPeriodos;

        do {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes (entre 1 y 10):");
            numEstudiantes = Integer.parseInt(input);
        } while (numEstudiantes < 1 || numEstudiantes > 10);

        do {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad de períodos académicos (entre 3 y 5):");
            numPeriodos = Integer.parseInt(input);
        } while (numPeriodos < 3 || numPeriodos > 5);

        double[][] calificaciones = new double[numEstudiantes][numPeriodos];

        while (true) {
            String menu = "Menú de Opciones:\n" +
                    "1. Ingresar calificaciones por período\n" +
                    "2. Ingresar calificaciones por estudiante\n" +
                    "3. Ver calificaciones\n" +
                    "4. Salir";

            String opcion = JOptionPane.showInputDialog(menu);
            int seleccion = Integer.parseInt(opcion);

            switch (seleccion) {
                case 1:
                    ingresarCalificacionesPorPeriodo(calificaciones);
                    break;
                case 2:
                    ingresarCalificacionesPorEstudiante(calificaciones);
                    break;
                case 3:
                    verCalificaciones(calificaciones);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    public static void ingresarCalificacionesPorPeriodo(double[][] calificaciones) {
        String periodoSeleccion = JOptionPane.showInputDialog("Ingrese el número de período (1-" + calificaciones[0].length + "):");
        int periodo = Integer.parseInt(periodoSeleccion);

        if (periodo < 1 || periodo > calificaciones[0].length) {
            JOptionPane.showMessageDialog(null, "Número de período no válido. Seleccione un período dentro del rango.");
            return;
        }

        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            String calificacionSeleccion = JOptionPane.showInputDialog("Ingrese la calificación del estudiante " + (estudiante + 1) + ":");
            double calificacion = Double.parseDouble(calificacionSeleccion);

            if (calificacion < 0 || calificacion > 10) {
                JOptionPane.showMessageDialog(null, "Calificación no válida. Debe estar en el rango de 0 a 10.");
                estudiante--;
            } else {
                calificaciones[estudiante][periodo - 1] = calificacion;
            }
        }

        JOptionPane.showMessageDialog(null, "Calificaciones ingresadas correctamente para el período " + periodo + ".");
    }

    public static void ingresarCalificacionesPorEstudiante(double[][] calificaciones) {
        String estudianteSeleccion = JOptionPane.showInputDialog("Ingrese el número de estudiante (1-" + calificaciones.length + "):");
        int estudiante = Integer.parseInt(estudianteSeleccion);

        if (estudiante < 1 || estudiante > calificaciones.length) {
            JOptionPane.showMessageDialog(null, "Número de estudiante no válido. Seleccione un estudiante dentro del rango.");
            return;
        }

        String periodoSeleccion = JOptionPane.showInputDialog("Ingrese el número de período (1-" + calificaciones[0].length + "):");
        int periodo = Integer.parseInt(periodoSeleccion);

        if (periodo < 1 || periodo > calificaciones[0].length) {
            JOptionPane.showMessageDialog(null, "Número de período no válido. Seleccione un período dentro del rango.");
            return;
        }

        String calificacionSeleccion = JOptionPane.showInputDialog("Ingrese la calificación para el estudiante " + estudiante + " en el período " + periodo + ":");
        double calificacion = Double.parseDouble(calificacionSeleccion);

        if (calificacion < 0 || calificacion > 10) {
            JOptionPane.showMessageDialog(null, "Calificación no válida. Debe estar en el rango de 0 a 10.");
        } else {
            calificaciones[estudiante - 1][periodo - 1] = calificacion;
            JOptionPane.showMessageDialog(null, "Calificación ingresada correctamente.");
        }
    }

    public static void verCalificaciones(double[][] calificaciones) {
        StringBuilder result = new StringBuilder("Calificaciones:\n");

        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            result.append("Estudiante ").append(estudiante + 1).append(": ");

            for (int periodo = 0; periodo < calificaciones[0].length; periodo++) {
                result.append("Período ").append(periodo + 1).append(": ").append(calificaciones[estudiante][periodo]).append(" ");
            }

            result.append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
