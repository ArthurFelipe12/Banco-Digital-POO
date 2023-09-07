public class Main {
    public static void main(String[] args) {

        Cliente Arthur = new Cliente();
        Arthur.setNome("Arthur");

        Conta corrente = new ContaCorrente(Arthur);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(Arthur);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
