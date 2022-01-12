
public class Banco {
	public static void main ( String args[])
	{
		Conta conta01 = new Conta();
		conta01.agencia = "111-9";
		conta01.conta = "1010";
		conta01.setLimite(1500);
		conta01.depositar(1000);
		conta01.sacar(200);
		System.out.println("Sua conta é  "+ conta01.conta + " da agencia "+ conta01.agencia);	
		//fazendo um condição para poder sacar se, somente se, o valor que estiver na conta for positivo.
		if (conta01.getSaldo() >0) {
		System.out.println("O saldo é apos o saque é =  " +conta01.getSaldo()+ " $");
		}else {
			if(conta01.getSaldo()<0) {
				System.out.println("Seu saldo é insuficiente!!!!");	
			}
		}	
	}
}
