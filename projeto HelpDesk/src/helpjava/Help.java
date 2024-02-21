package helpjava;

import javax.swing.JOptionPane;

/**
 *
 * Escola Técnica De Brasília          
 * Técnico em informática
 * Acenilto Moreira dos Passos Júnior 2E
 */
public class Help {

   public void helpIf (){
        JOptionPane.showMessageDialog(null, "if (expressão)" + "\n comando ou { bloco }" + "\n else // opcional" + "\n comando ou { bloco } // opcional");
    }

   public void helpFor(){
        JOptionPane.showMessageDialog(null, "for (inicialização; expressão; passo)\n" + "comando ou { bloco }");
    }


   public void helpWhile(){
        JOptionPane.showMessageDialog(null, "while (expressão)\n" + "comando ou { bloco }");
    }


   public void helpSwitch(){
        JOptionPane.showMessageDialog(null, "switch (variável)\n" +  "{\n" + "case (valor1): comando ou { bloco } break; \n" + "case (valor2): comando2 ou { bloco2 } break;\n" + "...\n" + "default: comando_final ou { bloco final }\n" +"}");
    }


   public void helpBreak(){
        JOptionPane.showMessageDialog(null, "break; ou break label;");
    }


}