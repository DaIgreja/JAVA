package loca;


public class LocacaoMensal extends Locacao {
    
    /* Declaração e inicialização dos atributos do objeto */
    private int mesesLoca;
    private float valorLocaMes, valorTotalMes;
    
    /* Método construtor */
    public LocacaoMensal(int codLoca, int diasLoca, int mesesLoca) {
        super(codLoca, diasLoca);//define o que será herdado da superclasse
        this.mesesLoca = mesesLoca;
        
    }
    
    /* Assinatura dos métodos de serviço */
    @Override
    public void cadastra(){
        super.cadastra();//invoca o método cadastra() da superclasse
        System.out.println("Entre com a quantidade de meses da locação:");
        setMesesLoca(sc.nextInt());//leitura da variável com o método nextInt()
        System.out.println("Entre com a quantidade de dias extras:");
        setDiasLoca(sc.nextInt());//leitura da variável com o método nextInt()
    }
    
    @Override
    public void mostra() {
        super.mostra();
        setValorLocaMes(getMesesLoca() * 8000);
        setValorTotalMes(getValorLocaMes() + getValorTotal());
        System.out.println("\nO aluguel custa R$8000,00 por mês mais R$100 por dia extra.");
        System.out.println("Caução custa R$900,00.");
        System.out.println("\nQuantidade de meses da locação: " +getMesesLoca());
        System.out.println("Quantidade de dias extras: " +getDiasLoca());
        System.out.println("Valor total da locação: " +df.format(getValorTotalMes()));
    }
    
    /* GETTERS E SETTERS */
    public int getMesesLoca() {
        return mesesLoca;
    }

    public void setMesesLoca(int mesesLoca) {
        this.mesesLoca = mesesLoca;
    }

    public float getValorLocaMes() {
        return valorLocaMes;
    }

    public void setValorLocaMes(float valorLocaMes) {
        this.valorLocaMes = valorLocaMes;
    }

    public float getValorTotalMes() {
        return valorTotalMes;
    }

    public void setValorTotalMes(float valorTotalMes) {
        this.valorTotalMes = valorTotalMes;
    }
    
}     

