
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;


public class Principal {
    public static void main(String[] args) {
    Triangulo tri = new Triangulo();
    
    //Entrada
    tri.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base")));
    tri.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));
    
    //Saída
    JOptionPane.showMessageDialog(null, " A área do triângulo é " + tri.getArea());
    } 
    
}
