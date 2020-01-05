
public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta(0, 0);
		conta.deposita(100);

		Conta primeiraConta = new Conta(0, 0);
		primeiraConta.deposita(1000);

		Conta segundaConta = new Conta(0, 0);
		primeiraConta.transfere(300, segundaConta);

	}
	
	// Quando é definido um construtor, ao inicializar um objeto, é obrigatório informar algum valor

}
