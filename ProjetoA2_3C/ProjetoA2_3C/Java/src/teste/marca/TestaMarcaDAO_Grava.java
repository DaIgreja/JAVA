
package teste.marca;

import modelo.Marca;
import persistencia.MarcaDAO;

public class TestaMarcaDAO_Grava {

    public static void main(String[] args) throws Exception {
        Marca marca = new Marca();
        
        marca.setCdMarca(2);
        marca.setMarca("Fiat");
        
        System.out.println(MarcaDAO.grava(marca));
    }
    
}
