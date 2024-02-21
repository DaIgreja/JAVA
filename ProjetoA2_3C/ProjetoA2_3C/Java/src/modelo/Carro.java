
package modelo;


public class Carro extends Veiculo {
    private String ano;
    private String cor;
    private double kmInicial;
    private Modelo modelo;
    public Carro(){}

    public Carro( String placa, String renavam,Modelo modelo, String ano, String cor, double kmInicial) {
        super(placa, renavam);
        this.modelo=modelo;
        this.ano = ano;
        this.cor = cor;
        this.kmInicial = kmInicial;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }
   
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    public String toString(){
        return 
                "\n Placa: " +getPlaca()+
                "\n Renavam: " +getRenavam()+
                "\n" +getModelo()+
                "\n Ano: " +getAno()+
                "\n Cor: " +getCor()+
                "\n Quilometragem Inicial: " +getKmInicial();
    }

    
}
