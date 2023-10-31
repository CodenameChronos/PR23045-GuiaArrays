package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_9{
	public static void main(String[] args){
		int[] arreglo = new int[10];
		rellenar(arreglo);
		ordenar(arreglo);
		mostrar(arreglo);
	}
	public static void rellenar(int[] arreglo){
		int numero;
		for(int indice = 0; indice <= arreglo.length - 1; indice++){
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lo posicion "+(indice + 1)));
			arreglo[indice] = numero;
		}
	}
        public static void ordenar(int[] arreglo) {
            int burbuja = arreglo[arreglo.length - 1];
            for (int indice = arreglo.length - 1; indice > 0; indice--) {
             arreglo[indice] = arreglo[indice - 1];
            }
            arreglo[0] = burbuja;
        }
	public static void mostrar(int[] arreglo){
		for(int indice = 0; indice <= arreglo.length - 1; indice++){
			System.out.println("pos "+indice+": "+arreglo[indice]);
		}
	}
}