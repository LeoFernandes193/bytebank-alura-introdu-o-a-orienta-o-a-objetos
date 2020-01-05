
public class Conta {

	/*
	 * Essa classe não se trata de uma conta, pois não podemos realizar funções
	 * básicas de uma conta bancaria. Mas ela se trata de uma especificação do tipo
	 * de conta. Também, não podemos realizar a execução desse programa, pois ele
	 * precisa do método main como ponto de entrada para a aplicação.
	 */

	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	private static int total;

	/*
	 * Quando declaramos um atrbuto como private, o mesmo só pode ser acessado
	 * dentro da própria classe. Para acessarmos em outras classes, usaremos os
	 * métodos. O private garante alterações acidentais,preservando a segurança da
	 * aplicação e garantindo o encapsulamento dos dados.
	 */

	/*
	 * Métodos são comportamentos que um objeto pode ter. Void siginifica que não
	 * esperamos nenhum retorno desse método. O nome do método dever ser começado
	 * com letra minuscula, e devemos informar o tipo de variavel que queremos usar
	 */
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println(getSaldo());

		// Usamos o this dentro de um método para acessar um atributo

	}

	/*
	 * Métodos get - Quando formos acessar ou pegar algum atributo dentro da classe,
	 * usamos o método get. Ele ira retornar algum valor (int, double, String).
	 * Método set - Quando formos alterar o valor de um atributo, usamos o método
	 * set. Ele não terá nenhum retorno, então será void
	 * 
	 */

	// Conforme o exemplo abaixo, um construtor serve para inicializar atributos com
	// valores padrão.

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
			System.out.println("Saque realizado com sucesso, seu novo saldo é " + getSaldo());
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
