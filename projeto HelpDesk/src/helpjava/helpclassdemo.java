package helpjava;

import javax.swing.JOptionPane;

/**
 *
 * Escola Técnica De Brasília          
 * Técnico em informática
 * Acenilto Moreira dos Passos Júnior 2E
 */
public class helpclassdemo {

    public static void main(String[] args) {
        boolean loop = true;

        Help help = new Help();

        while(loop){
            int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n 1)IF...ELSE \n 2)FOR \n 3)WHILE \n 4)SWITCH \n 5)BREAK \n 6)SAIR"));
            switch(op){
                case 1:
                    help.helpIf();
                    break;
                case 2:
                    help.helpFor();
                    break;
                case 3:
                    help.helpWhile();
                    break;
                case 4:
                    help.helpSwitch();
                    break;
                case 5:
                    help.helpBreak();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Programa fachado!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"Opção invalida! \n Digite Novamente!");

            }
        }
    }
}