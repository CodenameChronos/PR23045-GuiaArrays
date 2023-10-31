package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_23 {

    public static void main(String[] args) {
        String[][] estadisticasPokemon = {
            {"Pikachu", "90", "55", "40", "35"},
            {"Charizard", "100", "84", "78", "78"},
            {"Bulbasaur", "45", "49", "49", "45"},
            {"Squirtle", "43", "48", "65", "44"},
            {"Mewtwo", "130", "110", "90", "106"},
            {"Gengar", "110", "65", "60", "60"},
            {"Dragonite", "80", "134", "95", "91"},
            {"Snorlax", "30", "110", "65", "160"},
            {"Vaporeon", "65", "60", "95", "130"},
            {"Machamp", "55", "130", "80", "90"},
            {"Eevee", "55", "55", "50", "55"},
            {"Alakazam", "120", "50", "45", "55"},
            {"Lapras", "60", "85", "80", "130"},
            {"Gyarados", "81", "125", "79", "95"},
            {"Jigglypuff", "20", "45", "20", "115"}
        };

        String nombrePokemon = JOptionPane.showInputDialog("Ingrese el nombre del Pokémon:");

        boolean encontrado = false;
        for (String[] estadisticas : estadisticasPokemon) {
            if (nombrePokemon.equalsIgnoreCase(estadisticas[0])) {
                encontrado = true;
                String mensaje = "Estadísticas de " + estadisticas[0] + ":\n";
                mensaje += "Puntos de salud: " + estadisticas[1] + "\n";
                mensaje += "Ataque: " + estadisticas[2] + "\n";
                mensaje += "Defensa: " + estadisticas[3] + "\n";
                mensaje += "Velocidad: " + estadisticas[4];
                JOptionPane.showMessageDialog(null, mensaje);
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "El Pokémon no se encontró en la Pokédex.");
        }
    }
}
