
package teste.cliente;

import persistencia.ClienteDAO;

public class TestaClienteDAO_LeTodos {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.leTodos());
    }
    
}
