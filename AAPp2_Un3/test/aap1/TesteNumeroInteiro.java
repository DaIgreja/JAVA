package aap1;

import br.edu.etb.java.aap2.NumeroInteiro;
import java.util.Scanner;

/**
 * Escola Técnica de Brasília - E.T.B.; Curso Técnico de Informática; Linguagem
 * Técnica de Programação; Roger Bruno Andrade Santos; Turma:2°E; Objetivo:
 * Praticar a codificação de uma modelagem OO.
 */
public class TesteNumeroInteiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("Escolha uma opção : Calcular soma de números inteiros(A) Sair do programa(B)");
            char op = sc.next().charAt(0);
              NumeroInteiro numint = new NumeroInteiro();//instaciação do objeto A dentro da classe.
            switch (op) {
                case 'A':
                    numint.receber();
                    numint.somar();
                    numint.mostrar();
                    System.out.println("----Fim do Cálculo----");
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
    }
}
