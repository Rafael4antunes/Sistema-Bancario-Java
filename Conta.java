    package project;
    import javax.swing.JOptionPane;
    public class Conta {

        static double saldo = 0.00;
        static double investimento = 0.00;

        public static void main(String[] args) {
            

        }
        public static boolean login(){
            String senha = "18201817";
            String logSenha = JOptionPane.showInputDialog(null, "Digite a senha: ");

            if (senha.equals(logSenha)){
                JOptionPane.showMessageDialog(null, "Acesso liberado!!");
                return true;

            }else{ 
                JOptionPane.showMessageDialog(null, "Acesso negado!!", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
                    }   
            }

        
        public static void consultarSaldo(){
            JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + saldo + "R$");

        }
        public static void sacar(){
            String sacar = JOptionPane.showInputDialog(null, "Qual a quantidade a ser sacada: ");
                    try{
                    double saque = Double.parseDouble(sacar);
                    if (saque <= 0){
                        JOptionPane.showMessageDialog(null, "Digite um valor maior que zero!", "aviso", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (saldo >= saque){
                    saldo -= saque;
                    JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldo + "$");
                    }else{
                        JOptionPane.showMessageDialog(null, "Saque negado sem saldo suficiente!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    } catch (NumberFormatException | NullPointerException e ){
                        JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "aviso", JOptionPane.WARNING_MESSAGE);
                        }
        }
        public static void depositar(){
            String deposito = JOptionPane.showInputDialog(null, "Qual a quantidade a ser depositada: ");
                    try{
                    double valor = Double.parseDouble(deposito);
                    if (valor <= 0){
                        JOptionPane.showMessageDialog(null, "Digite um valor maior que zero!", "aviso", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    saldo += valor;
                    JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + saldo + "R$");
                    } catch (NumberFormatException | NullPointerException e ){
                        JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "aviso", JOptionPane.WARNING_MESSAGE);
                    }
        }
        public static void investir(){
            String investir = JOptionPane.showInputDialog(null, "Qual o valor a ser investido: ");
                    try{
                    double investiu = Double.parseDouble(investir);
                    if (investiu <= 0){
                        JOptionPane.showMessageDialog(null, "Digite um valor maior que zero!", "aviso", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (saldo >= investiu){
                        saldo -= investiu;
                        investimento += investiu;
                        JOptionPane.showMessageDialog(null, "Seu investimento atual é: " + investimento + "R$");
                    }else{
                        JOptionPane.showMessageDialog(null, "Investimento negado saldo insuficiente!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    } catch (NumberFormatException | NullPointerException e ){
                        JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "aviso", JOptionPane.WARNING_MESSAGE);
                        }

        }
        public static void rendimento(){
            investimento += investimento * 0.005;
                    JOptionPane.showMessageDialog(null, "Seu investimento atual é: " + investimento + "$");
        }
    }
