
public class Banco {
	public static void main ( String args[])
	{
		Conta conta01 = new Conta();
		conta01.agencia = "111-9";
		conta01.conta = "1010";
		conta01.setLimite(1500);
		conta01.depositar(1000);
		conta01.sacar(200);
		System.out.println("Sua conta �  "+ conta01.conta + " da agencia "+ conta01.agencia);	
		//fazendo um condi��o para poder sacar se, somente se, o valor que estiver na conta for positivo.
		if (conta01.getSaldo() >0) {
		System.out.println("O saldo � apos o saque � =  " +conta01.getSaldo()+ " $");
		}else {
			if(conta01.getSaldo()<0) {
				System.out.println("Seu saldo � insuficiente!!!!");	
			}
		}	
	}
}
