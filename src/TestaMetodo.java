
public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta(0, 0);
		conta.deposita(100);

		Conta primeiraConta = new Conta(0, 0);
		primeiraConta.deposita(1000);

		Conta segundaConta = new Conta(0, 0);
		primeiraConta.transfere(300, segundaConta);

	}
	
	// Quando � definido um construtor, ao inicializar um objeto, � obrigat�rio informar algum valor

}
