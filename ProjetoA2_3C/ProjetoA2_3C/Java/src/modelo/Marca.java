
package modelo;


public class Marca {
    private int cdMarca;
    private String marca;
    
    public Marca(){}

    public Marca(int cdMarca,String marca) {
        this.cdMarca = cdMarca;
        this.marca = marca;
    }
    public int getCdMarca() {
        return cdMarca;
    }

    public void setCdMarca(int cdMarca) {
        this.cdMarca = cdMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String toString(){
        return 
                "\n Código da marca: " +getCdMarca()+
                "\n Marca: " +getMarca();
    }
}
