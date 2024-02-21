
package loca;

/**
 * Escola Técnica de Brasília
 * Técnico em Informática
 * Linguagem Técnica de Programação
 * Autor: Acenilto Moreira dos Passos Júnior          
 * Data: 06/11/2021 
 * Objetivo: Implementar o DC3 Guiado_GT01 
 */
public class TesteLocacao {

    public static void main(String[] args) {
        LocacaoMensal loc = new LocacaoMensal(0,0,0); //Instância do objeto loc na classe Locacao
        loc.cadastra();
        loc.mostra();
    }
    
}
