import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        try {
            Cliente a = new Cliente();
            String nomeGerente = JOptionPane.showInputDialog("Digite o nome do Gerente:");
            a.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));

            Conta cc = new ContaCorrente(a);
            Conta cp = new ContaPoupanca(a);


            cc.getBanco().getGerenteBanco().setNome(nomeGerente);
            cp.getBanco().getGerenteBanco().setNome(nomeGerente);

            cc.depositar(100);
            cc.transferir(100, cp);

            cc.imprimirExtrato();
            cp.imprimirExtrato();
        }catch (Exception e)

        {}



    }

}
