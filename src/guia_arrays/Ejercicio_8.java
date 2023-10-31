package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_8{
	public static void main(String[] args){
                int[] numbers = new int[10];
		rellenar(numbers);
		add_number(numbers);
                show(numbers);
	}
	public static void rellenar(int[] numbers){
		int insert;
		for(int i = 0; i<8; i++){
			insert = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la posición "+(i+1)));
                        numbers[i] = insert;
		}
	}
	public static void add_number(int[] numbers){
		int adition, where;
		adition = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor extra"));
		do{
			where = Integer.parseInt(JOptionPane.showInputDialog("¿Dónde desea insertarlo?"));
		}while(where < 0 && where > 10);
		for(int iter = 9; iter >= where; iter--){
			numbers[iter] = numbers[iter - 1];
		}
		numbers[where - 1] = adition;
	}
        public static void show(int[] numbers){
            for(int i = 0; i <= numbers.length - 1; i++){
                System.out.println(numbers[i]);
            }
        }
}