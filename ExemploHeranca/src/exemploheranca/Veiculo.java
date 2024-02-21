package exemploheranca;



public class Veiculo {
   private String chassi;
   private String modelo;

    public Veiculo(String chassi, String modelo) {
        this.chassi = chassi;
        this.modelo = modelo;
    }

    
    
    
    
    
    
    public String getChassi() {
        return chassi;
    }
    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
