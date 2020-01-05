
public class Conta {

	/*
	 * Essa classe n�o se trata de uma conta, pois n�o podemos realizar fun��es
	 * b�sicas de uma conta bancaria. Mas ela se trata de uma especifica��o do tipo
	 * de conta. Tamb�m, n�o podemos realizar a execu��o desse programa, pois ele
	 * precisa do m�todo main como ponto de entrada para a aplica��o.
	 */

	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	private static int total;

	/*
	 * Quando declaramos um atrbuto como private, o mesmo s� pode ser acessado
	 * dentro da pr�pria classe. Para acessarmos em outras classes, usaremos os
	 * m�todos. O private garante altera��es acidentais,preservando a seguran�a da
	 * aplica��o e garantindo o encapsulamento dos dados.
	 */

	/*
	 * M�todos s�o comportamentos que um objeto pode ter. Void siginifica que n�o
	 * esperamos nenhum retorno desse m�todo. O nome do m�todo dever ser come�ado
	 * com letra minuscula, e devemos informar o tipo de variavel que queremos usar
	 */
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println(getSaldo());

		// Usamos o this dentro de um m�todo para acessar um atributo

	}

	/*
	 * M�todos get - Quando formos acessar ou pegar algum atributo dentro da classe,
	 * usamos o m�todo get. Ele ira retornar algum valor (int, double, String).
	 * M�todo set - Quando formos alterar o valor de um atributo, usamos o m�todo
	 * set. Ele n�o ter� nenhum retorno, ent�o ser� void
	 * 
	 */

	// Conforme o exemplo abaixo, um construtor serve para inicializar atributos com
	// valores padr�o.

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
		System.out.println("Total de contas criadas " + total);

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean saca(double valor) {
		this.saldo -= valor;
		if (this.saldo >= valor) {
			System.out.println("Saque realizado com sucesso, seu novo saldo � " + getSaldo());
			return true;
		} else {
			System.out.println("Saque indisponivel");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}
}
