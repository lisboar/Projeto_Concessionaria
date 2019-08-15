package View;

import javax.swing.JOptionPane;

import model.Caminhao;
import model.Carro;
import model.Moto;
import model.Veiculo;

public class Projeto_1 {

	public static void main(String[] args) {

		int opcao = -1;
		
		while (opcao != 0) {
			String menu = "1 - Cadastrar Veículo\n" + 
							"2 - Cadastrar Carro \n" +
							"3 - Cadastrar Moto\n" +
							"4 - Cadastrar Caminhão \n" +
							"0 - Sair";
			opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
			
			switch(opcao) {
			case 1:
				
				Veiculo v =new Veiculo();
				v.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				v.cadastrar();
				
				break;			
			case 2:
				
				Carro c =new Carro();
				c.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				String sPortas = JOptionPane.showInputDialog("Digite a quantidade de portas:");
				c.portas = Integer.valueOf(sPortas);
				c.cadastrar();
				
				break;
			case 3:
				
				Moto m = new Moto();
				m.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				String cCilindrada = JOptionPane.showInputDialog("Digite quantas cilindradas:");
				m.cilindradas = Integer.valueOf(cCilindrada);
				
				m.cadastrar();
							
				break;
			case 4:

				Caminhao cm =new Caminhao();
				cm.modelo = JOptionPane.showInputDialog("Digite o modelo:");
				String eEixos = JOptionPane.showInputDialog("Digite a quantidade de eixos:");
				cm.eixos = Integer.valueOf(eEixos);
				cm.cadastrar();
				
				break;
			default:
				
				if (opcao != 0) {
					JOptionPane.showMessageDialog(null, "Opção Invalida!");
				}
				
				break;
			}
			
		}
		

	}

}
