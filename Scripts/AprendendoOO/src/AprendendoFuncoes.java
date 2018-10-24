import static javax.swing.JOptionPane.showMessageDialog; //Exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usiario
import static java.lang.Integer.parseInt; //Converter String -> int
import static java.lang.Float.parseFloat; //Converter String -> float



public class AprendendoFuncoes{
    public static void main(String[] args) {
       int n1 = parseInt(showInputDialog("Digite n1"));
       int n2 = parseInt(showInputDialog("Digite n2"));
       int resultado = calculaSoma(n1,n2);
        showMessageDialog(null, resultado);
    }
    
    //somar 2 números [int]: [int]
    private static int calculaSoma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    }
}