/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;



public class DeCarga extends Veiculo{
   private double peso;

    public DeCarga(double peso, String chassi, String modelo) {
        super(chassi, modelo);
        this.peso = peso;
    }

   

    
    public double getPeso() {
        return peso;
    }

    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
