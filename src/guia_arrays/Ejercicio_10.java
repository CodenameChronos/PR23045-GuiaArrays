package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_10{
	public static void main(String[] args){
		int[] crecientes = new int[10];
		insert(crecientes);
		extra(crecientes);
		ordenar(crecientes);
		mostrar(crecientes);
	}
	public static void insert(int[] crecientes){
		int numero;
		for(int pos = 0; pos <= 4; pos++){
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la posicion "+(pos + 1)));
			crecientes[pos] = numero;
		}
	}
	public static void extra(int[] crecientes){
		int num_extra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		crecientes[crecientes.length - 1] = num_extra;
	}
	public static void ordenar(int[] crecientes){
		int bubble;
		for(int iter = 0; iter <= crecientes.length - 1; iter++){
			for(int indice = 0; indice <= crecientes.length - 2; indice++){
				if(crecientes[indice] > crecientes[indice + 1]){
					bubble = crecientes[indice + 1];
					crecientes[indice + 1] = crecientes[indice];
					crecientes[indice] = bubble;
				}
			}
		}
	}
	public static void mostrar(int[] crecientes){
		for(int i = 0; i <= crecientes.length - 1; i++){
			System.out.println(crecientes[i]);
		}
	}
}