    package project;
    import javax.swing.JOptionPane;
    public class Banco {

        public static void main(String[] args) {
            if (Conta.login()){
            conta();}

        }
        public static boolean conta(){
            while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "Selecione uma opção:\n" +
                    "1 - Consultar Saldo\n" +
                    "2 - Sacar Dinheiro\n" +
                    "3 - Depositar\n" +
                    "4 - Investir\n"+
                    "5 - Investimento\n"+
                    "6 - Sair"        
            );
            if (opcao == null) return true;

            switch(opcao){
                case "1":
                    Conta.consultarSaldo();
                    break;
                case "2":
                    Conta.sacar();
                    break;
                case "3":
                    Conta.depositar();
                    break;

                case "4":
                    Conta.investir();
                    break;
                case "5":
                    Conta.rendimento();
                    break;

                case "6":
                    return true;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
                }       
            }

        }
             
    }
    