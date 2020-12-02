package Controle;

import Utilidades.Data;

public class RegistroContas {

	public static void main(String[] args) {
		Data d=new Data(01,12,2020);
		Correntista c1=new Correntista("12345","Roberta");
		Correntista c2=new Correntista("34345","Renata");
		Correntista [] correntistas=new Correntista[2];
		correntistas[0]=c1;
		correntistas[1]=c2;
		Conta conta1=new Conta(345, d, correntistas, 200);
		System.out.println(conta1);
	}

}
