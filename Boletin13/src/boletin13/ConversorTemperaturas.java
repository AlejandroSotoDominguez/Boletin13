
package boletin13;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {
    final int constante = 80;
    
    public ConversorTemperaturas() {
    }
    
    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion{
        float centigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce grados centígrados:"));
        if (centigrados>constante){
            JOptionPane.showMessageDialog(null,9f/5f*centigrados+32.4f+" Fahrenheit");
        }else throw new TemperaturaErradaExcepcion("recorda que a temperatura non pode ser < 80 ºC");
    }
    
    public void centigradosAReamur() throws TemperaturaErradaExcepcion{
        float centigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce grados centígrados:"));
        if(centigrados>constante){
            JOptionPane.showMessageDialog(null,4f/5f*centigrados+" Reamur");
        }else throw new TemperaturaErradaExcepcion("recorda que a temperatura non pode ser < 80 ºC");
    }
}
