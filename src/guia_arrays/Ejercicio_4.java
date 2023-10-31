package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_4{
	public static void main(String[] args){
		String[] pokemon = new String[5];
		String pkmn; 
		for(int indice = 0; indice < pokemon.length; indice++){
			pkmn = JOptionPane.showInputDialog("Ingrese el numero de la posicion "+(indice + 1));
			pokemon[indice] = pkmn;
		}
		for(int indice = 4; indice >= 0; indice--){
			System.out.println(pokemon[indice]);
		}
	}
}