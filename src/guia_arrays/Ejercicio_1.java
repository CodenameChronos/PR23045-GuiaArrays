package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_1{
	public static void main(String[] args){
		int[] numeros = new int[5];
		int num; 
		for(int indice = 0; indice < numeros.length; indice++){
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion "+(indice + 1)));
			numeros[indice] = num;
		}
		for(int indice = 0; indice < numeros.length; indice++){
			System.out.println(numeros[indice]);
		}
	}
}