
package modelo;


public class Modelo {
    private int cdModelo;
    private String modelo;
    private Marca marca;
    
    public Modelo(){}

    public Modelo(int cdModelo,String modelo, Marca marca) {
        this.cdModelo = cdModelo;
        this.modelo = modelo;
        this.marca = marca;
    }
    public int getCdModelo() {
        return cdModelo;
    }

   
    public void setCdModelo(int cdModelo) {
        this.cdModelo = cdModelo;
    }

    
    public String getModelo() {
        return modelo;
    }

   
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public Marca getMarca() {
        return marca;
    }

    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public String toString(){
        return 
                "\n Código do Modelo: " +getCdModelo()+
                "\n Modelo: " +getModelo()+
                "\n" +getMarca();
    }
}
