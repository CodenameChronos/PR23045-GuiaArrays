package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_5{
	public static void main(String[] args){
		int[] numeros = new int[5];
		int num, max = 0, min = 100000000; 
		for(int indice = 0; indice < numeros.length; indice++){
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion "+(indice + 1)));
			numeros[indice] = num;
		}
		for(int indice = 0; indice < numeros.length; indice++){
			if(numeros[indice] < min){
				min = numeros[indice];
			}
				
			if(numeros[indice] > max){
				max = numeros[indice];
			}		
		}
                System.out.println("El valor maximo es "+max);
                System.out.println("El valor minimo es "+min);
	}
}