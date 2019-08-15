package model;

import javax.swing.JOptionPane;

public class Veiculo {
	
	public int id, passageiros, ano;
	public String modelo;
	private String placa;
	
	
	public Veiculo() {
		
	}
	
	
	public Veiculo (String _modelo) {
		this.modelo = _modelo;
	}
	
	
	public Veiculo(int id, int passageiros, int ano, String modelo, String placa) {
		this.id = id;
		this.passageiros = passageiros;
		this.ano = ano;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	
	public void cadastrar() {
		String texto = "Veículo " + this.modelo + " cadastrado com sucesso!";
		System.out.println(texto);
		JOptionPane.showMessageDialog(null, texto);
	}
	
}
