package Program;

import javax.swing.JOptionPane;
import java.sql.JDBCType;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos Calcular seu IMC");

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Sigite o seu Peso"));

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Sigite a sua altura"));

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC calculado foi:  %.2f%n", imc);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null,"Você Está abaixo do Peso");

        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null,"Seu peso está normal");

        } else if (imc >= 25.0 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null,"Você está com sobrepeso");
            
        } else if (imc >= 30.0 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null,"Você está com Obesidade grau I");
            
        } else if (imc >= 35.0 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null,"Você está com obesidade grau II");
            
        }else {

            JOptionPane.showMessageDialog(null,"Você está com Obesidade Grave!");
        }

        scanner.close();

    }
}
