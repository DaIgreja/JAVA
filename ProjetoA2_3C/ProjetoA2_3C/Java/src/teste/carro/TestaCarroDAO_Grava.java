
package teste.carro;
import modelo.Carro;
import modelo.Modelo;
import persistencia.CarroDAO;
import persistencia.ModeloDAO;
public class TestaCarroDAO_Grava {


    public static void main(String[] args)throws Exception {
      Carro carro = new Carro();
      carro.setPlaca("ABC1234");
      carro.setRenavam("catB1234");
      carro.setAno("2019");
      carro.setCor("Branco");
      carro.setKmInicial(87.765);
      
      Modelo modelo = new Modelo();
      modelo.setCdModelo(1);
      
      carro.setModelo(modelo);
      
        System.out.println(CarroDAO.grava(carro));
    }
    
}
