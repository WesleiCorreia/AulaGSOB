import static javax.swing.JOptionPane.showMessageDialog; //Exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usiario
import static java.lang.Integer.parseInt; //Converter String -> int
import static java.lang.Float.parseFloat; //Converter String -> float
import static java.lang.String.valueOf;//??? -> string

public class Ex401{
    
    public static void main(String[] args) {
     
        int[] A = new int [10];
        int[] B = new int [10];
        
        for (int i = 0; i < 10; i++) {
             A[i] = receberInt(
                "Digite o " + (i+1) + "° número"
             );    
        }
        
        for (int i = 0; i < 10; i++) {
            if (i%2==0) {
               B[i] = A[i] * 5; 
            }else{
                B[i] = A[i] + 5;
            }
        }
        
        String mensagem = " ";

        for (int i = 0; i < 10; i++) {
            mensagem += "A["+ i + "]: " +A[i] + "   " + "B["+ i +"]: " + B[i] + "\n";
        }
        exibir(mensagem);
        
        
    }//fim main
    
    
    public static int receberInt(String mansagemProUsuario) {
        try {
            //codigo normal
            return parseInt(showInputDialog(mansagemProUsuario));
            
        } catch (Exception e) {
            //se deu errado :(
        }
        
        return 0;
    }
    
     public static void exibir(String mansagemProUsuario) {
        showMessageDialog(null, mansagemProUsuario);
    }
    
}

