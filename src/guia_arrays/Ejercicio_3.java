package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_3{
	public static void main(String[] args){
		int[] numeros = new int[10];
		int num, num_ultimo;
		num_ultimo = numeros.length; 
		for(int indice = 0; indice < numeros.length; indice++){
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion "+(indice + 1)));
			numeros[indice] = num;
		}
		for(int indice = 0; indice < numeros.length/2; indice++){
			System.out.println(numeros[indice]);
			System.out.println(numeros[num_ultimo - 1]);
			num_ultimo = num_ultimo -1;
		}
	}
}