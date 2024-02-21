
package aap1;

// *Escola Técnica de Brasília - E.T.B.;

import br.edu.etb.java.aap2.funcsal;
import java.util.Scanner;

 /* Curso Técnico de Informática;
 * Linguagem Técnica de Programação;
 * Roger Bruno Andrade Santos;
 * Turma:2°E;
 * Objetivo: Praticar a codificação de uma modelagem OO.*/
public class testefuncsal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop){
        funcsal funcsal2 = new funcsal();
        System.out.println("Escolha uma opção : Calcular valor de depósito(A) Sair do programa(B)");
            char op = sc.next().charAt(0);
            switch(op){
                case'A':
                    funcsal2.receber();
                    funcsal2.aumento();
                    funcsal2.calcularnovosal();
                    funcsal2.mostrar();
                    break;
                     case 'B':
                    System.out.println("Saindo do programa...\n Programa Encerrado com sucesso!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida o programa será encerrado!");
                    System.exit(0);
                
            }
        
        
        
        funcsal2.mostrar();
        }
    }
}