package desafiodio;

public class ContaCorrente extends Conta{
	
public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

public void imprimirExtrato() {	
		System.out.println( "******Extrato da Conta Corrente ********");
	 System.out.println("  valor de Saldo: R$ 230,00");
	 System.out.println("  valor de tranferencia para Poupança: R$ 140,00 para Maria");
	super.imprimirInfoComuns();
	

	}

	
}
