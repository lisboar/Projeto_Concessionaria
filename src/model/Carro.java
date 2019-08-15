package model;

import javax.swing.JOptionPane;

public class Carro extends Veiculo{
	
	public double portaMalas;
	public int portas;
	
	public Carro() {
		
	
	}
	
	public Carro(String modelo) {
		super(modelo);
		
	}
	
	public Carro(String modelo, int portas) {
		super(modelo);
		this.portas = portas;
	}
	
	@Override //sinaliza que o metodo abaixo ja existe na superclasse e esta sendo reescrito aqui
	public void cadastrar() {
		String texto = "Carro " + this.modelo + " com " + this.portas + " portas cadastrado com sucesso!";
		JOptionPane.showMessageDialog(null, texto);
	}

}
