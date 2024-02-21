package br.edu.etb.java.aap2;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Acenilto
 */
public class dep {
     public float n1,n2,dep,juros,rend,total;
    DecimalFormat df = new DecimalFormat("000");
    Scanner sc = new Scanner (System.in);
    
    public void receber(){
    System.out.println("Qual o valor do depósito?");
    dep= sc.nextFloat();
    System.out.println("Qual o valor da taxa de juros '%'?");
    juros= sc.nextFloat();
    
            }
    public void calcularrend(){
        rend= Float.parseFloat(df.format(dep*juros/100f));
    }
     public void calculartotal(){
        total= Float.parseFloat(df.format(dep+dep*juros/100f)); 
    }
     public void mostrar(){
        System.out.println("***************BANCO DO PROGRAMADOR**************"
                + "BDP***********"+
                "\nO valor do depósito é :"+dep+
                "\n O valor da taxa de juros :"+juros+
    "\n*************CÁLCULO DO RENDIMENTO********CALCREND************"+
            "\n Valor do Rendimento :"+rend+
    "\n************CÁLCULO DO VALOR TOTAL**********CALCTOT************"+
                "O valor total é :"+total);
    }
}
