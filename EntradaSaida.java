
/**
 * Escreva uma descrição da classe EntradaSaida aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import javax.swing.*;

public class EntradaSaida
{
    public static String receberString(String msg) {
        String txt;
        txt = JOptionPane.showInputDialog(msg);
        return txt;
    }
    
    public static int receberInt(String msg) {
        String snro;
        int inro;
        snro = JOptionPane.showInputDialog(msg);
        inro = Integer.parseInt(snro);
        return inro;
    }
    
    public static float receberFloat(String msg) {
        String snro;
        float fnro;
        snro = JOptionPane.showInputDialog(msg);
        fnro = Float.parseFloat(snro);
        return fnro;
    }
    
    public static double receberDouble(String msg) {
        String snro;
        double dnro;
        snro = JOptionPane.showInputDialog(msg);
        dnro = Double.parseDouble(snro);
        return dnro;
    }
    
    public static void mostrarTexto(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}
