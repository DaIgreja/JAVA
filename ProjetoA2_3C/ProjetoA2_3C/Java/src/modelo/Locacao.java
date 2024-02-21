
package modelo;

import java.util.Date;


public class Locacao {
    private int cdLocacao;
    private Date dataLocacao;
    private Date dataDevolucao;
    private double valorLocacao;
    private Funcionario funcionario;
    private Cliente cliente;
    private Veiculo veiculo;
    
    public Locacao(){}

    public Locacao(int cdlocacao,Date dataLocacao, Date dataDevolucao, double valorLocacao, Funcionario funcionario, Cliente cliente, Veiculo veiculo) {
        this.cdLocacao = cdLocacao;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }
     public int getCdLocacao() {
        return cdLocacao;
    }

   
    public void setCdLocacao(int cdLocacao) {
        this.cdLocacao = cdLocacao;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public String toString(){
        return 
                "\n Código da locação: " +getCdLocacao()+
                "\n Data da locação: " +getDataLocacao()+
                "\n Data da devolução: " +getDataDevolucao()+
                "\n Valor da Locação: R$ " +getValorLocacao()+
                "\n " +getFuncionario()+
                "\n " +getCliente()+
                "\n " +getVeiculo();
                
    }
            
}
