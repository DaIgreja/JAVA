/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;


public class DePasseio extends Veiculo{
     
      private int ano;

    public DePasseio(int ano, String chassi, String modelo) {
        super(chassi, modelo);
        this.ano = ano;
    }

    
    
    
      
        
    
    

   
   
      
      
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
