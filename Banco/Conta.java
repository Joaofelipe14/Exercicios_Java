
public class Conta {
	// metodos da classe conta
	String conta;
	String agencia;
	private double saldo;
	private double limite;
	public void depositar ( double valor)
	{
		saldo = saldo + valor;			
	}
	public void sacar (double valor)
	{
		if (saldo  + limite >= valor);
		saldo = saldo - valor;
	}
	public double getSaldo()
	{
		return saldo;
	}
	public void setLimite( double valor)
	{
		limite = valor;
	}
	public double getLimite() 
	{
		return limite;
	}
}
