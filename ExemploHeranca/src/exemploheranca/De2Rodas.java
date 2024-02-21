/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;



public class De2Rodas extends Veiculo{

   private String placa;

    public De2Rodas(String placa, String chassi, String modelo) {
        super(chassi, modelo);
        this.placa = placa;
    }

   
    public String getPlaca() {
        return placa;
    }

    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
   
}
