
package boletin13_2;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {
    final int constante = 80;
    
    public ConversorTemperaturas() {
    }
    
    public void centigradosAReamur(){
        float centigrados;
        do{
            centigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce grados centígrados:"));
            if(centigrados>constante){
                JOptionPane.showMessageDialog(null,4f/5f*centigrados+" Reamur");    
            }     
        }while(centigrados<constante);
    }
}