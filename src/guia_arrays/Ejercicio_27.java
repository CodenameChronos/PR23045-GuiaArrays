package guia_arrays;

import java.util.Scanner;

public class Ejercicio_27 {

    private static char[][] tablero = new char[3][3];
    private static char jugador1 = 'X';
    private static char jugador2 = 'O';
    private static char turnoActual = jugador1;

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();

        while (true) {
            jugarTurno(turnoActual);
            mostrarTablero();

            if (haGanado(jugador1)) {
                System.out.println("¡Jugador 1 ha ganado!");
                break;
            } else if (haGanado(jugador2)) {
                System.out.println("¡Jugador 2 ha ganado!");
                break;
            } else if (tableroLleno()) {
                System.out.println("Es un empate.");
                break;
            }

            cambiarTurno();
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static void jugarTurno(char jugadorActual) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Turno del Jugador " + (jugadorActual == jugador1 ? "1 (X)" : "2 (O)"));
        System.out.println("Ingrese la fila (0-2) y columna (0-2) separadas por espacios:");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        if (esMovimientoValido(fila, columna)) {
            tablero[fila][columna] = jugadorActual;
        } else {
            System.out.println("Movimiento no válido. Intenta de nuevo.");
            jugarTurno(jugadorActual);
        }
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    private static boolean haGanado(char jugador) {
        // Comprobar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }

    private static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void cambiarTurno() {
        turnoActual = (turnoActual == jugador1) ? jugador2 : jugador1;
    }
}
