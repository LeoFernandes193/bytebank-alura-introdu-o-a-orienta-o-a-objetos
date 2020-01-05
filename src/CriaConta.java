
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(0, 0);
		primeiraConta.deposita(200);

		/*
		 * No c�digo acima, foi inst�nciado um objeto do tipo conta atrav�s do new
		 * Depois o new devolveu uma refer�ncia e foi armazenada na variavel
		 * primeiraConta. Essa variavel � do tipo conta.
		 */

		Conta segundaConta = new Conta(0, 0);
		segundaConta.deposita(200);

		/*
		 * Por padr�o, quando o Java inst�ncia um objeto, os valores dos atributos s�o
		 * zerados. Na especifica��o de um objeto, podemos definir um valor padr�o para
		 * um atributo
		 */

		Conta terceiraConta = new Conta(0, 0);
		terceiraConta.deposita(1500);
		terceiraConta.saca(200);
	}
}
