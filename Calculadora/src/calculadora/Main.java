/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equations number = new Equations();
        number.setNumber(Double.parseDouble(JOptionPane.showInputDialog("Insira o Número a Ser Operado: ")));
        int controler=10;
        while(controler!=0){
            controler=Integer.parseInt(JOptionPane.showInputDialog("1: Adição\n2: Subtração\n3: Divisão\n4: Multiplicação"));
            switch(controler){
                case 1:
                    number.adition(Double.parseDouble(JOptionPane.showInputDialog("O número a ser somado: ")));
                    JOptionPane.showMessageDialog(null, "Resultado: "+number.getNumber());
                    break;
                case 2:
                    number.subtraction(Double.parseDouble(JOptionPane.showInputDialog("O número a ser subtraido: ")));
                    JOptionPane.showMessageDialog(null, "Resultado: "+number.getNumber());
                    break;
                case 3:
                    number.division(Double.parseDouble(JOptionPane.showInputDialog("O número a dividir: ")));
                    JOptionPane.showMessageDialog(null, "Resultado: "+number.getNumber());
                    break;
                case 4:
                    number.multiplicator(Double.parseDouble(JOptionPane.showInputDialog("O número a  multiplicar: ")));
                    JOptionPane.showMessageDialog(null, "Resultado: "+number.getNumber());
                    break;
            }
        }
    }
    
}
