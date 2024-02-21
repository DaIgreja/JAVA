
package loca;

import java.text.DecimalFormat;//Importação da classe DecimalFormat do pacote java.text
import java.util.Scanner;//Importação da classe Scanner do pacote java.util

public class Locacao {
    
    /* Declaração e inicialização dos atributos do objeto */
    private int codLoca, diasLoca;
    private float valorLoca, valorTotal;
    public Scanner sc = new Scanner(System.in);
    public DecimalFormat df = new DecimalFormat("R$#,###.00");//Formatação para reais
    
    /* Método construtor */
    public Locacao(int codLoca, int diasLoca) {
        this.codLoca = codLoca;
        this.diasLoca = diasLoca;
    }
    
    /* Assinatura dos métodos de serviço */
    public void cadastra() {
        /* Entrada de dados */
        System.out.println("\n**************** SISTEMA DE LOCAÇÃO DE VEÍCULOS - LOCAVEI ****************");
        System.out.println("Entre com o código da locação:");
        setCodLoca(sc.nextInt());//leitura da variável com o método nextInt()
        
    }
    
    public void mostra() {
        
        /* Cálculo do valor da locação */
        setValorLoca(getDiasLoca() * 100);
        setValorTotal(getValorLoca() + 900); //Valor caução de garantia
        
        /* Saída de dados */
        System.out.println("\n**************** RELATÓRIO DE USUÁRIO ****************");
        System.out.println("\nCódigo da locação: " +getCodLoca());
        
    }
    
    /* GETTERS E SETTERS */
    public int getCodLoca() {
        return codLoca;
    }

    public void setCodLoca(int codLoca) {
        this.codLoca = codLoca;
    }

    public int getDiasLoca() {
        return diasLoca;
    }

    public void setDiasLoca(int diasLoca) {
        this.diasLoca = diasLoca;
    }

    public float getValorLoca() {
        return valorLoca;
    }

    public void setValorLoca(float valorLoca) {
        this.valorLoca = valorLoca;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
