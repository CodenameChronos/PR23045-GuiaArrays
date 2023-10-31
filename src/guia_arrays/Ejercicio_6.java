package guia_arrays;
public class Ejercicio_6{
	public static void main(String[] args){
		int indice_pkmnA = 0, indice_pkmnB = 0;
		String[] nombresPokemonA = {
				"Pikachu",
				"Charizard",
				"Bulbasaur",
				"Squirtle",
				"Jigglypuff",
				"Eevee",
				"Mewtwo",
				"Snorlax",
				"Gengar",
				"Machamp"
				};
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
		String[] nombresPokemonC = new String[nombresPokemonA.length + nombresPokemonB.length];

		for(int indice = 0; indice < nombresPokemonC.length; indice+=2){
			nombresPokemonC[indice] = nombresPokemonA[indice_pkmnA];
			nombresPokemonC[indice+1] = nombresPokemonB[indice_pkmnB];
			indice_pkmnA++;
			indice_pkmnB++;
		}
                for(int indice = 0; indice < nombresPokemonC.length; indice++){
                    System.out.println(nombresPokemonC[indice]);
                }
	}
}