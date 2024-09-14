public class Main {

    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");
        Conta cc = new ContaCorrente(felipe);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(felipe);

        cc.transferir(100 ,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
