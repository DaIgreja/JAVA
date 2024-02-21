
package teste.cliente;

import persistencia.ClienteDAO;


public class TestaClienteDAO_Exclui {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.exclui("12345678911"));
    }
    
}
