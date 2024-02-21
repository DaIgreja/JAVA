package br.edu.etb.java.aap1;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Contas {
   
  public String cgcFor;
public float gTri, gJan, gFev, gMar; 
public float LIMORC = 5000000;
public int sTri;
    
   public void recebe(){
       System.out.println("--------------------- MÁQUINA  DE CONTAS --------------------");
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe CGC:");
       cgcFor = sc.nextLine();
       System.out.println("Informe gastos de Janeiro:");
       gJan = sc.nextFloat();
       System.out.println("Informe gastos de Fevereiro:");
       gFev = sc.nextFloat();
       System.out.println("Informe gastos de Março:");
       gMar = sc.nextFloat();
   } 
    public void gastoTri(){
    gTri = gJan + gFev + gMar;
    }
    
    public void saldoTri(){
    sTri = (int) (LIMORC - gTri);
    }
    
	
    public void comparaGasto(){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern(",##0,00");
    if (LIMORC >= gTri) {
        JOptionPane.showMessageDialog(null, "Necessário reduzir despesas!\nDéficit de: "+df.format(sTri));
       } else {
        JOptionPane.showMessageDialog(null,"Parabéns!!\nGestão Financeira em ordem!\nSuperávit de: "+df.format(sTri));
}
    }
    public void mostra(){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,000.00");
        System.out.println("CGC Fornecedor:"+cgcFor+"\nOrçamento:"+df.format(LIMORC)+"\nGasto de Janeiro:"+df.format(gJan)
                +"\nGasto de Fevereiro:"+df.format(gFev)+"\nGasto de Merço:"+df.format(gMar));
    }    
}