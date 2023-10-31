package guia_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_16 {

    public static void main(String[] args) {
        String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur",
            "Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};
        int where = - 1, poder = 0;
        
        for(int mayor = 0; mayor < poderesPokemon.length; mayor++){
            if(poderesPokemon[mayor] > poder){
                poder = poderesPokemon[mayor];
                where = mayor;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Pokemon: " + nombresPokemon[where] + "\nPoder: " + poder);
    }
}
