package Controle;

import Utilidades.Data;

public class Conta {
	private int nroConta;
	private double saldo;
	private Data dataAbertura;
	private Correntista [] correntistas;
	
	public Conta(int nroConta, Data dataAbertura, Correntista [] correntistas, double amount) {
		this.nroConta=nroConta;
		this.dataAbertura=dataAbertura;
		this.correntistas=correntistas;
		this.saldo=amount;
		
	}
	
	public String toString() {
		String res = "nroConta: "+ nroConta + " saldo: " + saldo + " Data Abertura: " + dataAbertura;
		for(int i=0;i<correntistas.length;i++) {
			res=res+" "+" "+correntistas[i];
		}
		return res;
	}
	
	public boolean fazerDeposito(double amount){
		if (amount>=0) {
			saldo=saldo+amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean fazerSaque(double amount) {
		if(saldo>amount) {
			saldo=saldo-amount;
			return true;
		}
		else {
			return false;
		}
	}
	
		public boolean fazerTransferencia(Conta destino, double amount) {

			if(this.fazerSaque(amount)==true) {
				destino.fazerDeposito(amount);
				return true;
			}
			else {
				return false;
			}
			
		}
	}

