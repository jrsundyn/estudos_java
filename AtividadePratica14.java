   //AtividadePratica14
import javax.swing.*;
   class AtividadePratica14
   {
	   public static void main (String entrad[])
	   {
		   //DECLARAÇÃO DE VARIAVEIS
		   int n1, n2;
		   double pot, div;
		   String msg="";
		   
		   //ENTRADA DE DADOS
		   n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro","Entrada de dados"));
		   n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro","Entrada de dados"));
		   
		   //PROCESSAMENTO
		   div = (double)n1 / (double)n2;
		   pot = Math.pow(n1,n2);
		   
		   //SAIDA DE DADOS
		   
		   msg = msg + "quociente da divisão de " + n1 + " por " + n2 + " = " + div + "\n";
		   msg = msg + "o número " + n1 + " elevado a " + n2 + " potência é = " + pot + "\n";
		   JOptionPane.showMessageDialog(null, msg);
		   
		   System.exit(0);
	   }
   }
		   
		   
		   
	   

	