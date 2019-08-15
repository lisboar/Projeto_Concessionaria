package model;

import javax.swing.JOptionPane;

public class Moto extends Veiculo{
	
	public int cilindradas;
	public boolean partidaEletrica;
	
	public Moto() {
		
	}
	
	public Moto(String modelo) {
		super(modelo);
	}

	public Moto(String _modelo, int cilindradas, boolean partidaEletrica) {
		super(_modelo);
		this.cilindradas = cilindradas;
		this.partidaEletrica = partidaEletrica;
	}
	
	@Override //sinaliza que o metodo abaixo ja existe na superclasse e esta sendo reescrito aqui
	public void cadastrar() {
		String texto = "Moto " + this.modelo + " com " + this.cilindradas  + " cilindradas cadastrado com sucesso!";
		JOptionPane.showMessageDialog(null, texto);
	}
	
	

}
