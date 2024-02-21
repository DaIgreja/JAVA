package aap1;

//*Escola Técnica de Brasília - E.T.B.;
import br.edu.etb.java.aap2.carro;
import java.util.Scanner;

/* Curso Técnico de Informática;
 * Linguagem Técnica de Programação;
 * Roger Bruno Andrade Santos;
 * Turma:2°E;
 * Objetivo: Praticar a codificação de uma modelagem OO.
 */
public class testecarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean loop = true;
        Scanner sc = new Scanner(System.in);
        carro car;
        car = new carro();
        while (loop) {
            System.out.println("Escolha uma opção : Calcular valor do carro(A) Sair do programa(B)");
            char op = sc.next().charAt(0);
            switch (op) {
                case 'A':
                    car.receber();

                    car.valordocarro();
                    car.mostrar();
                    break;
                case 'B':
                    System.out.println("Saindo do programa...\n Programa Encerrado com sucesso!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida o programa será encerrado!");
                    System.exit(0);
            }

            System.out.println("*********FIM DO ATENDIMENTO*********");
        }
    }
}
