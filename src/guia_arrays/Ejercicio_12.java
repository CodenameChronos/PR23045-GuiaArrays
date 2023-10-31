package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_12 {

    public static void main(String[] args) {
        String pokemon;
        Boolean comparador;
        int where = -1;
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
        do{
        pokemon = JOptionPane.showInputDialog("Ingrese un nombre");
        }while(pokemon.isEmpty());
        for(int i = 0; i < nombresPokemonB.length; i++){
            if(nombresPokemonB[i].equals(pokemon)){
                where = i + 1;
            }
        }
        if(where == -1){
            JOptionPane.showMessageDialog(null, "El pokemon ingresado no existe en la lista");
        }else{
            JOptionPane.showMessageDialog(null, "Pokemon en la posicion " + where);
        }
    }
}
