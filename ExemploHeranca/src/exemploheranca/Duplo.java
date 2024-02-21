/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;


public class Duplo extends DeCarga{
    private int qtdeEixos;

    public Duplo(int qtdeEixos, double peso, String chassi, String modelo) {
        super(peso, chassi, modelo);
        this.qtdeEixos = qtdeEixos;
    }

     public String toString(){
       return "\n Modelo simples - caminhão: " + getModelo() + 
               "\n Chassi: " + getChassi() +
               "\n Peso: " + getPeso() +
               "\n Quantidade de eixos: " + getQtdeEixos();
    }
   
    
    

   
    public int getQtdeEixos() {
        return qtdeEixos;
    }


    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }
    
}
