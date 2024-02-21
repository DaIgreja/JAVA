
package teste.cliente;

import persistencia.ClienteDAO;


public class TestaClienteDAO_LeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.leUm("12345678911"));
    }
    
}
