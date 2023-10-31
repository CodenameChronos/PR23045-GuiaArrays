package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_15 {

    public static String pkmn = "";
    public static int where = - 1;

    public static void main(String[] args) {
        String[] nombresPokemon = {"pikachu", "charizard",
            "bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};
        pokemon(nombresPokemon);
        valido(nombresPokemon);
        poder(poderesPokemon);
        mostrar(nombresPokemon, poderesPokemon);
    }

    public static void pokemon(String nombresPokemon[]) {
        do {
            pkmn = JOptionPane.showInputDialog("Ingrese un nombre");
        } while (pkmn.isEmpty());
    }

    public static void valido(String nombresPokemon[]) {
        for (int valid = 0; valid < nombresPokemon.length; valid++) {
            if (pkmn.equals(nombresPokemon[valid])) {
                where = valid;
            }
        }
    }

    public static void poder(int poderesPokemon[]) {
        if (where == -1) {
            JOptionPane.showMessageDialog(null, "El pokemon no existe");
        } else {
            int poder_neo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor del poder"));
            poderesPokemon[where] = poder_neo;
        }
    }

    public static void mostrar(String nombresPokemon[], int poderesPokemon[]) {
        for (int show = 0; show < poderesPokemon.length; show++) {
            JOptionPane.showMessageDialog(null, "Pokemon: " + nombresPokemon[show] + "\nPoder: " + poderesPokemon[show]);
        }
    }
}
