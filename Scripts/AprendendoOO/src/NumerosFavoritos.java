import static javax.swing.JOptionPane.showMessageDialog; //Exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usiario
import static java.lang.Integer.parseInt; //Converter String -> int
import static java.lang.Float.parseFloat; //Converter String -> float
import static java.lang.String.valueOf;//??? -> string

public class NumerosFavoritos{
    
    public static void main(String[] args) {
        
        //criando um array de 1D
        int[] numFav = new int [7];
        //como acessar um elemento do array
        //numFav[5] = 2;
        
        //preencher o array
        for (int cont = 0; cont < numFav.length; cont++) {
             numFav[cont] = receberInt(
                "Digite o " + (cont+1) + "° favorito"
             );    
        }
        
        //var aux
        String mensagem = " ";
         
        //acessar os elementos do array
         for (int cont = 0; cont < numFav.length; cont++) {        
              mensagem +=  "Num Fav "+(cont+1) + ": " + numFav[cont]+ "\n";             
            
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
    
}//fim class