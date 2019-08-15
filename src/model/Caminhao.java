package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{
	
	public int eixos;
	public double carga;
	
	public Caminhao() {
		
	}

	public Caminhao(String _modelo, int eixos, double carga) {
		super(_modelo);
		this.eixos = eixos;
		this.carga = carga;
	}
	
	@Override //sinaliza que o metodo abaixo ja existe na superclasse e esta sendo reescrito aqui
	public void cadastrar() {
		String texto = "Caminhão " + this.modelo + " com " + this.eixos + " eixos cadastrado com sucesso!";
		JOptionPane.showMessageDialog(null, texto);
	}

}
