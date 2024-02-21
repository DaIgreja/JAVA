/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;


public class Simples extends DeCarga{
    private double comprimento;

    public Simples(double comprimento, double peso, String chassi, String modelo) {
        super(peso, chassi, modelo);
        this.comprimento = comprimento;
    }

    public String toString(){
       return "\n Modelo simples - caminhão: " + getModelo() + 
               "\n Chassi: " + getChassi() +
               "\n Peso: " + getPeso() +
               "\n Comprimento: " + getComprimento();
    }
    
    
    
    public double getComprimento() {
        return comprimento;
    }
    
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
