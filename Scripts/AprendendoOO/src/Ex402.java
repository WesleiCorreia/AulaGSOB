import static javax.swing.JOptionPane.showMessageDialog; //Exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usiario
import static java.lang.Integer.parseInt; //Converter String -> int
import static java.lang.Float.parseFloat; //Converter String -> float
import static java.lang.String.valueOf;//??? -> string

public class Ex402{
    
    public static void main(String[] args) {
        
     float [] A = new float [5];
     float aux = 0;

        for (int i = 0; i < 5; i++) {
            A[i] = receber("Digite o " + (i+1) + "° elemento");
        }
        
        for (int i = 0; i < 5; i++) {
            if (A[i]%2!=0) {
                aux+=A[i];
            }else{
               
            }
        }
        exibir("Soma:" + aux);
       
        
        
    }//fim main
    
    public static float receber(String mansagemProUsuario) {
        try {
            //codigo normal
            return parseFloat(showInputDialog(mansagemProUsuario));
            
        } catch (Exception e) {
            //se deu errado :(
        }
        
        return 0;
    }
    
     public static void exibir(String mansagemProUsuario) {
        showMessageDialog(null, mansagemProUsuario);
    }
    
    
}