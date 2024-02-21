/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;




public class Moto extends De2Rodas{
    private double cilindrada;

    public Moto(double cilindrada, String placa, String chassi, String modelo) {
        super(placa, chassi, modelo);
        this.cilindrada = cilindrada;
    }

    
     public String toString(){
        
       return "\n Modelo - moto: " + getModelo() +
               "\n Chassi: " + getChassi() + 
               "\n Placa: " + getPlaca() + 
               "\n Cilindradas: " + getCilindrada();
    }
    
    
    
    public double getCilindrada() {
        return cilindrada;
    }

    
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
