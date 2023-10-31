package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_7{
	public static void main(String[] args){
		int[] numeros = new int[10];
		int num, cambio = 0;
		Boolean creciente = false;
		Boolean decreciente = false; 
		for(int indice = 0; indice < numeros.length; indice++){
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion "+(indice + 1)));
			numeros[indice] = num;
		}
		for(int indice = 0; indice < numeros.length - 1; indice++){
			if(numeros[indice] > numeros[indice + 1]){
				if(indice == 0){
					decreciente = true;
				} else{
					if(decreciente == false){
						cambio = 1;
					} 
				}
			} else if(numeros[indice] < numeros[indice + 1]){
				if(indice == 0){
					creciente = true;
				} else{
					if(creciente == false){
						cambio = 1;
					}
				}
			}
		}
		if(cambio == 1){
			System.out.println("El vector esta desordenado");
		} else if(creciente == true && cambio == 0){
			System.out.println("El vector es creciente");
		} else if(creciente == false && decreciente == false && cambio == 0){
			System.out.println("Los valores del vector son iguales");
		} else if(decreciente == true && cambio == 0){
			System.out.println("El vector es decreciente");
		}
	}
}