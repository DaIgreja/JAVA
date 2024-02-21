
package teste.carro;

import modelo.Carro;
import modelo.Modelo;
import persistencia.CarroDAO;

public class TestaCarroDAO_Altera {

    public static void main(String[] args) throws Exception {
       
        Carro c = new Carro();
        c.setPlaca("");
        c.setAno("");
        c.setCor("");
        c.setKmInicial(0);
        
        Modelo m = new Modelo();
        m.setCdModelo(0);
        
        c.setModelo(m);
        
        System.out.println(CarroDAO.altera(c));
    }
    
}
