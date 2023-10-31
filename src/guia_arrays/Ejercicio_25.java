package guia_arrays;
import javax.swing.JOptionPane;
public class Ejercicio_25 {
    public static void main(String[] args){
        char p[] = {'A','x','5','@','a','b','c','d','e','f','g'};
        int tamanio_array = p.length;
        Boolean mayus = false, minus = false, symbol = false, dig = false, longitud = false, aprobada = false;
        for(int caracter = 0; caracter < p.length; caracter++){
            if(Character.isUpperCase(p[caracter])){
                mayus = true;
            }else if(Character.isLowerCase(p[caracter])){
                minus = true;
            }else if(Character.isDigit(p[caracter])){
                dig = true;
            }else if(Character.isWhitespace(p[caracter])){
            }else if(Character.isSpaceChar(p[caracter])){
            }else{
                symbol = true;
            }
            if(tamanio_array >= 8){
                longitud = true;
            }
            if(symbol == true && longitud == true && dig == true && mayus == true && minus == true){
                aprobada = true;
            }
        }
        JOptionPane.showMessageDialog(null, "Contraseña aprobada: " + aprobada + "\nRequisitos:\n\nMayusculas: " + mayus + "\nMinusculas: " + minus + "\nDigitos: " + dig + "\nSimbolos: " + symbol);
    }
}
