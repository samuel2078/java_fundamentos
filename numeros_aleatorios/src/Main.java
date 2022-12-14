import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dadosFace =(int)Math.round(Math.random()*100 ) ;
       // JOptionPane.showMessageDialog(null, dadosFace);

        Random gerador = new Random();
    int faceDados = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números são?"));
    int resultado = 1+ gerador.nextInt(faceDados);
        JOptionPane.showMessageDialog(null, resultado);

    }
}