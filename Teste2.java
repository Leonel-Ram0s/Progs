import javax.swing.JOptionPane;

class Teste2 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        String AnoNascStr = jp.showInputDialog(null, "Ano nascimento?"); 
       
        int anoNascInt = Integer.parseInt (null, "Ano nascimento?");
        
        int idade = 2022 - anoNascInt;

        jp.showMessageDialog(null, "Sua idade: "+ idade); 



    }
}