
package teste.marca;

import persistencia.MarcaDAO;

public class TestaMarcaDAO_Altera {

   
    public static void main(String[] args) throws Exception {
        System.out.println(MarcaDAO.altera(1, "Ford"));
    }
    
}
