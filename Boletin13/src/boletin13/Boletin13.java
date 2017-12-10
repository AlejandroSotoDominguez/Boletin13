
package boletin13;

import javax.swing.JOptionPane;

public class Boletin13 {

    public static void main(String[] args) {
        ConversorTemperaturas obj1 = new ConversorTemperaturas();
        
        try{
            obj1.centigradosAFharenheit();
            obj1.centigradosAReamur();
        }catch(TemperaturaErradaExcepcion ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
