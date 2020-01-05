
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(0, 0);
		primeiraConta.deposita(200);

		/*
		 * No código acima, foi instânciado um objeto do tipo conta através do new
		 * Depois o new devolveu uma referência e foi armazenada na variavel
		 * primeiraConta. Essa variavel é do tipo conta.
		 */

		Conta segundaConta = new Conta(0, 0);
		segundaConta.deposita(200);

		/*
		 * Por padrão, quando o Java instância um objeto, os valores dos atributos são
		 * zerados. Na especificação de um objeto, podemos definir um valor padrão para
		 * um atributo
		 */

		Conta terceiraConta = new Conta(0, 0);
		terceiraConta.deposita(1500);
		terceiraConta.saca(200);
	}
}
