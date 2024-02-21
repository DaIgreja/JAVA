
package modelo;


public class Cliente extends Pessoa {
    private String renach;

    public Cliente(){}
   
    public Cliente( String cpf,String nome,  String renach) {
        super(cpf, nome);
        this.renach = renach;
    }

    public String getRenach() {
        return renach;
    }

    public void setRenach(String renach) {
        this.renach = renach;
    }
    public String toString(){
        return 
                "\n Cpf: " +getCpf()+
                  "\n Nome: " +getNome()+
                "\n Renach: " +getRenach();
    }
}
