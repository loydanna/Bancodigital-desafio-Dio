public class Main {

    public static void main(String[] args) {
        Cliente loy =new Cliente();
        loy.setNome("Loyanna");

        Conta cc = new ContaCorrente(loy);
        Conta poupança = new Poupança(loy);

        cc.depositar(100);
        cc.transferir(100,poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
