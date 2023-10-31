package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_13 {

    public static void main(String[] args) {
        int index = - 1;
        String[] nombresPokemonB = {
            "Venusaur",
            "Blastoise",
            "Dragonite",
            "Gyarados",
            "Alakazam",
            "Arcanine",
            "Lapras",
            "Golem",
            "Gyarados",
            "Rhydon"
        };
        do {
            index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una posicion (1~10)"));
        } while (index < 1 || index > nombresPokemonB.length);
        JOptionPane.showMessageDialog(null, nombresPokemonB[index - 1]);
    }
}
