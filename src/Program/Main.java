package Program;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Main {
    static void main() {

        Locale.setDefault(Locale.US);

        System.out.println("Vamos Calcular seu IMC");

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu Peso"));

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));

        double imc = peso / (altura * altura);
        String formatado = String.format("%.2f", imc);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null,"Seu IMC é: %.2f%n "+ formatado +" Você está abaixo do peso");

        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null,"Seu IMC é: %.2f%n"+ formatado +" Seu peso está normal");

        } else if (imc >= 25.0 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null,"Seu IMC é: %.2f%n"+ formatado +" Você está com sobrepeso");
            
        } else if (imc >= 30.0 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null,"Seu IMC é:"+ formatado + " Você está com Obesidade grau I");
            
        } else if (imc >= 35.0 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null,"Seu IMC é: "+ formatado + " Você está com obesidade grau II");
            
        }else {

            JOptionPane.showMessageDialog(null," Você está com Obesidade Grave!");
        }



    }
}
