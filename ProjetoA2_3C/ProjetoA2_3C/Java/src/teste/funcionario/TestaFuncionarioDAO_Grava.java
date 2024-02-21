
package teste.funcionario;

import modelo.Funcionario;
import persistencia.FuncionarioDAO;

public class TestaFuncionarioDAO_Grava {

   
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(2);
        funcionario.setNome("João Afonso");
        funcionario.setCpf("02152136300");
        
        
        System.out.println(FuncionarioDAO.grava(funcionario));
    }
    
}
