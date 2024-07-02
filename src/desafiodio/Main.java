package desafiodio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente Alessandra = new Cliente();
		Alessandra.setNome("Alessandra");
		
		Conta cc = new ContaCorrente(Alessandra);
		
		cc.depositar(230);
		
		 Cliente Maria = new Cliente();
			Maria.setNome("Maria");
		Conta poupanca = new ContaPoupanca(Maria);
		
		cc.transferir(140, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		 cc.transferir(48, poupanca);
		 cc.imprimirExtrato();
		 poupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca alisson
	      
		
	}
	

		
	
	
}


		
		


		
	
	
	

		
	


