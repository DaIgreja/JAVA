package aap1;

 //*Escola Técnica de Brasília - E.T.B.;

import br.edu.etb.java.aap2.nascimento;
import java.util.Scanner;


 /* Curso Técnico de Informática;
 * Linguagem Técnica de Programação;
 * Roger Bruno Andrade Santos;
 * Turma:2°E;
 * Objetivo: Praticar a codificação de uma modelagem OO.*/
public class testenascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean loop = true;
        Scanner sc = new Scanner(System.in);
         nascimento nasc;
       nasc= new nascimento();
        while(loop){
        System.out.println("Escolha uma opção : Calcular idade(A) Sair do programa(B)");
            char op = sc.next().charAt(0);
       switch (op){
           case 'A':
               nasc.receber();
               nasc.calcularatual();
               nasc.calcular2080();
               nasc.mostrar();
               break;
                     case 'B':
                    System.out.println("Saindo do programa...\n Programa Encerrado com sucesso!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida o programa será encerrado!");
                    System.exit(0);
       }
       
        }
       System.out.println("*********CÁLCULOS DE IDADE CONCLUÍDOS*************");
    }
    
}
