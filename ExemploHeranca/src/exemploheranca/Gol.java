package exemploheranca;


public class Gol extends DePasseio{
      private int qtdePortas;

    public Gol(int qtdePortas, int ano, String chassi, String modelo) {
        super(ano, chassi, modelo);
        this.qtdePortas = qtdePortas;
    }

    public String toString(){
        return "\n Dados do veículo de passeio - gol:" + 
                "\n Modelo: " + getModelo() + 
                "\n Chassi: " + getChassi() + 
                "\n Ano:" + getAno() + 
                "\n Quantidade de Portas:" + getQtdePortas();
    }


    
    public int getQtdePortas() {
        return qtdePortas;
    }

    
    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
}
