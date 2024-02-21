
package teste.cliente;
import modelo.Cliente;
import persistencia.ClienteDAO;

public class TestaClienteDAO_Grava {

   
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        
        cliente.setCpf("12345678911");
        cliente.setNome("Heitor Fernande");
        cliente.setRenach("334545");
        
        System.out.println(ClienteDAO.grava(cliente));
    }
    
}
