package calculomediajava.executavel;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Informa a nota 1:");
		String nota2 = JOptionPane.showInputDialog("Informa a nota 2:");
		String nota3 = JOptionPane.showInputDialog("Informa a nota 3:");
		String nota4 = JOptionPane.showInputDialog("Informa a nota 4:");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double totalNotas = dNota1 + dNota2 + dNota3 + dNota4;
		
		double media = totalNotas / 4;
		
		int showResult = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da média?");
		System.out.println(media);
		
		String totalMessage = "Total das notas : " + Double.toString(totalNotas);
		String passMessage = "Média: " + Double.toString(media) + "\nAluno aprovado!";
		String repMessage = "Média: " + Double.toString(media) + "\nAluno Reprovado!";
		String recMessage = "Média: " + Double.toString(media) + "\nAluno em recuperação!";
		
		if(media >= 70 && showResult == 0) {
			JOptionPane.showMessageDialog(null, totalMessage + "\n" + passMessage);
		} else if ((media > 50 && media <= 69) && showResult == 0) {
			JOptionPane.showMessageDialog(null, totalMessage + "\n" + recMessage);
		} else {
			JOptionPane.showMessageDialog(null, totalMessage + "\n" + repMessage);
		}
	}
}
