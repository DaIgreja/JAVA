
package teste.modelo;
import modelo.Marca;
import modelo.Modelo;
import persistencia.ModeloDAO;
public class TestaModeloDAO_Grava {

    public static void main(String[] args)throws Exception {
        Modelo modelo = new Modelo();
        modelo.setCdModelo(1);
        modelo.setModelo("Ka Segan");
        
        Marca marca = new Marca();
        marca.setCdMarca(1);
        modelo.setMarca(marca);
        
        System.out.println(ModeloDAO.grava(modelo));
    }
    
}
