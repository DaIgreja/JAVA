/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.etb.java.aap2;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Acenilto
 */
public class funcsal {
     public float sal,novosal,aumento;
    DecimalFormat df = new DecimalFormat("000");
    Scanner sc = new Scanner (System.in);
     public void receber(){
         System.out.println("Qual o Salário do funcionário?");
         sal= sc.nextFloat();
     }
     public void aumento (){
        Float.parseFloat(df.format (aumento= sal*25/100f));
     }
    public  void calcularnovosal(){
         Float.parseFloat(df.format(novosal= sal+aumento));      
    }
     public void mostrar(){
        System.out.println("Salário anterior : "+sal+ "\n Valor aumentado :"+aumento+ "\n Novo salário:"+novosal);
        
        System.out.println("Cálculo concluído!"+"\n**** Tenha um bom dia!****"); 
    }
    
}
