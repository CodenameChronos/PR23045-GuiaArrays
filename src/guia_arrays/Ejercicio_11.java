package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_11{
	public static void main(String[] args){
		int vector[] = new int[10];
                rellenar(vector);
                eliminar(vector);
                mostrar(vector);
	}
	public static void rellenar(int vector[]){
		for(int r = 0; r < 10; r++){
			vector[r] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor " + (r + 1)));
		}
	}
	public static void eliminar(int vector[]){
            int where;
		do{
			where = Integer.parseInt(JOptionPane.showInputDialog("Que índice desea eliminar? (0~9)"));
		}while (where < 0 && where > 9);
		vector[where] = 0;
                for(int ord = where; ord <= 8; ord++){
                    if(ord == 8){
                        vector[ord] = vector[ord + 1];
                        vector[9] = 0;
                    } else{
                        vector[ord] = vector[ord + 1];
                    }
                }
	}
        public static void mostrar(int vector[]){
            for(int sh = 0; sh < vector.length; sh++){
                System.out.println(vector[sh]);
            }
        }
}