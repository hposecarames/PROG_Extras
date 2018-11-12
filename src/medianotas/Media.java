package medianotas;

import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author menuven
 */
public class Media {

    double teorico1;
    double teorico2;
    double practico;
    double boletin;
    double resultado;
    
    public Media() {
    }

    public Media(double teorico1, double teorico2, double practico, double boletin, double resultado) {
        this.teorico1 = teorico1;
        this.teorico2 = teorico2;
        this.practico = practico;
        this.boletin = boletin;
        this.resultado = resultado;
    }

    public void datos() {
        teorico1 = pedirNotaT();
        JOptionPane.showMessageDialog(null,"La nota del teorico1 es: +"+teorico1);
        teorico2 = pedirNotaT();
        JOptionPane.showMessageDialog(null,"La nota del teorico2 es: +"+teorico2);
        practico = pedirNotaP();
        JOptionPane.showMessageDialog(null,"La nota del practico es: +"+practico);
        boletin = pedirBoletin();
        JOptionPane.showMessageDialog(null,"La nota del boletin es: +"+boletin);
        
    }
    public double pedirNotaT(){
            
        double num;
        do{
            num = Double.parseDouble(JOptionPane.showInputDialog("Introduce una nota de teoría: "));
        }while (num<1||num>10);
        return num;
    }
    public double pedirNotaP(){
            
        double num;
        do{
            num = Double.parseDouble(JOptionPane.showInputDialog("Introduce una nota de práctica: "));
        }while (num<1||num>10);
        return num;
    }
    public double pedirBoletin(){
        double num;
        do{
            num = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del boletin: "));
        }while (num<0||num>2);
        return num;
        }
    public void mostrarDatos(){
        resultado = (((teorico1+teorico2)/2)*0.40)+(practico*0.40)+boletin;
        JOptionPane.showMessageDialog(null, "A nota media e: "+Math.round(resultado));
    }
    }
        
        
    
          
            
