
package exemploheranca;


public class TstVeiculo {

    
    public static void main(String[] args) {
        Gol G = new Gol(4, 2002, "ABX1273", "Gol G2");
        System.out.println(G);
    
        Moto M = new Moto(1000, "DBO1279", "ABG", "CB1000");
        System.out.println(M);
        
        Duplo D = new Duplo(3, 7.000, "WORKED", "WOLSKVAGEN 13-540");
        System.out.println(D);
        
        Simples S = new Simples(13.00, 3.000, "WORKING", "WOLSKVAGEN 8-150");
        System.out.println(S);
        
    }
    
    
}
