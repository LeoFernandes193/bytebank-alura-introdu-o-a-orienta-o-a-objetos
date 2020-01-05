
public class TestaBanco {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		// Composição de ojeto

		Conta conta = new Conta(0, 0);

		conta.setTitular(cliente);

		conta.getTitular().setNome("Leonardo");
		conta.getTitular().setCpf("222.222.222-22");
		conta.getTitular().setProfissao("Desenvolvedor");
	}
}
