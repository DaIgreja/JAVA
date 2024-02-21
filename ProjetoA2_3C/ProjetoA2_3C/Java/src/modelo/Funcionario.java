
package modelo;


public class Funcionario extends Pessoa {
    private int matricula;

    public Funcionario(){}
    public Funcionario(  int matricula, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String toString(){
        return 
                "\n Matrícula: " +getMatricula()+
                "\n Nome: " +getNome()+
                "\n Cpf: " +getCpf();
                
              
    }
}
